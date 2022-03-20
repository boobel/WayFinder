fun FinishPosSearch(a: Int): Int {
    if(a < 5){
    return 9
    }
    else{
    return 0
    }
     
    }
     
    fun printTable(table: Array<Array<String>>)
    {
    for (i in 0..table.size-1)
    {
    for (j in 0..table.size-1)
    {
    print(table[j][i])
    }
    println("")
    }
    }
     
     
     
    fun main() {
    val table = Array(10) {Array(10){"0"}}
     
    var x_StartPos = (0..9).random()
    var y_StartPos = (0..9).random()
     
    var x_FinishPos = FinishPosSearch(x_StartPos)
    var y_FinishPos = FinishPosSearch(y_StartPos)
     
    table[x_StartPos][y_StartPos] = "x"
    table[x_FinishPos][y_FinishPos] = "!"
    var x = x_StartPos
    var y = y_StartPos
     
    println("Pozycja startowa: ${x_StartPos+1} ${y_StartPos+1}")
    println("Pozycja koncowa: ${x_FinishPos+1} ${y_FinishPos+1}")
    printTable(table)
     
    var step = 0
    while (x != x_FinishPos)
    {
    if(x > x_FinishPos)
    {
    x = x - 1
    table[x][y] = "x"
    print("L")
    step++
    }
    else
    {
    x = x + 1
    table[x][y] = "x"
    print("R")
    step++
    }
    if (step == 5)
    {
    print(" aktualna pozycja: $x $y")
    println("")
    printTable(table)
    println("")
    step = 0
    }
    }
    while (y != y_FinishPos)
    {
    if(y > y_FinishPos)
    {
    y = y - 1
    table[x][y] = "x"
    print("U")
    step++
    }
    else
    {
    y = y + 1
    table[x][y] = "x"
    print("D")
    step++
    }
    if (step == 5)
    {
    print(" aktualna pozycja: $x $y")
    println("")
    printTable(table)
    println("")
    step = 0
    }
     
    }
    println(" aktualna pozycja: $x $y")
    printTable(table)
     
    }
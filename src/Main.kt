import java.security.Principal

/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   CHAIN REACTION
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    https://github.com/waimea-ranorton/kotlin-lvl2-game
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

val board = mutableListOf<String>()
var player1 = "P1"
var player2 = "P2"

//main game loop
//Players insert names, board is shown, player1 places counter, points updated, player 2 places counter, points updated
// so on until a win or lose.

fun main() {
    showIntro()
    getPlayerNames()
    createboard()

    while (true) {
        showboard()
        //loop, broken if player win or lose
        while (true) {
            println("$player1 Enter square: ")
            getPlacement("■")
            showboard()
            checkPoints()

            println("$player2 Enter square: ")
            getPlacement("○")
            showboard()
            checkPoints()

        }
    }
}//work out problem with coloring counters

//----------------------------------------------------------------------------------------------------------------------
//This function creates a decorative title
fun showIntro() {
    println("=========================".cyan())
    println("\uD83D\uDCA3    CHAIN REACTION   \uD83D\uDCA3".blue())
    println("=========================".cyan())
    println("")
}

//----------------------------------------------------------------------------------------------------------------------
//This function asks both players for usernames that will be used though out the game
fun getPlayerNames() {
    while (true) {
        println("Hello Players")
        println("Insert Player 1 name: ".green())
        val answer = readlnOrNull()
        if (!answer.isNullOrBlank()) {
            player1 = answer
            break
        }
    }

    while (true) {
        println("Insert Player 2 name: ".blue())
        val answer2 = readlnOrNull()
        if (!answer2.isNullOrBlank()) {
            player2 = answer2
            break
        }

    }
}

//-----------------------------------------------------------------------------------------------------------

//This function creates the counters
//each " " is a possible loaction for a counter

fun createboard() {
    println(" ")
    repeat(12) {
        board.add(" ")
    }
}

//This function creates the structure of the board, it helps the user understand the game
fun showboard() {

    //numbers
    for (i in 1..board.size) {
        print("$i".padEnd(6).padStart(12))
    }

    //top
    println()
    print("┏".cyan())
    println("━━━━━━━━━━━┳".repeat(board.size-1).cyan() + ("━━━━━━━━━━━┓").cyan())

    //counters
    for (i in 0..<board.size) {
        print("┃".cyan() + "${board[i].padEnd(5).padStart(10)} ")
    }
    println("┃".cyan())

    //bottom
    print("┗".cyan())
    println("━━━━━━━━━━━┻".repeat(board.size-1).cyan() + ("━━━━━━━━━━━┛").cyan())

}
//----------------------------------------------------------------------------------------------------------------------
//This function gets the users position for their counter, it understands if the users input is valid or not and reacts
//accordingly.
fun getPlacement(counter: String) {

    var location: Int?

    while (true) {
        println("Options")
        println("1,2,3,4,5,6,7,8,9,10,11,12")
        //using input to get where next counter is located
        location = readlnOrNull()?.toIntOrNull()


        if (location != null && location in 1..12) break

        else println("Invalid input"); return

    }

    board[location!! - 1] = counter

}

//----------------------------------------------------------------------------------------------------------------------
//Updating player points and checking for win
fun checkPoints(){

    var p1Points: Int?
    var p2Points: Int?

//figure out giving points

    if (p1Points != null && p1Points <= 10) p1Win()

    if (p2Points != null && p1Points <= 10) p2Win()



    }

//----------------------------------------------------------------------------------------------------------------------
//If a player has 10 points or more than the game ends and they are congratulated
fun p1Win(){
    println("Congratulations $player1")
}

fun p2Win(){
    println("Congratulations $player2")
}
//----------------------------------------------------------------------------------------------------------------------

//place counter in users given location
//I need to assign the number values to the X's

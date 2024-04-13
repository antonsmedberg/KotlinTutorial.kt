
// Grundläggande och avancerade exempel på Kotlin programmering med pedagogiska kommentarer

// Variabler och deras typer

// Föränderlig variabel: Kan ändras efter initialisering
var ålder = 30  // Bra för värden som ändras, som användarinteraktion eller tidsbaserade händelser.

// Oändlig variabel: Kan inte ändras efter initialisering
val namn = "Anna"  // Används för konstant data som inte ska ändras efter tilldelning.

// Demonstrera grundläggande datatyper

val heltal: Int = 42  // Standarddatatyp för heltal.
val sanning: Boolean = true  // Används i logiska uttryck för att hantera flöden och beslut.
val text: String = "Hej Kotlin"  // För att hantera textsträngar.
val nummerArray: Array<Int> = arrayOf(1, 2, 3, 4)  // En array med fast storlek.
val nummerLista: List<String> = listOf("äpple", "banan", "citron")  // Listor är flexibla och kan växa och minska.

// Avancerade kontrollstrukturer

// Villkorssatser för att hantera olika scenarier baserat på villkor
if (ålder >= 18) {
    println("Du är vuxen.")
} else {
    println("Du är inte vuxen.")
}

// Iteration över samlingar med for-loop
for (frukt in nummerLista) {
    println(frukt)
}

// Hantering av nullable-värden med 'let' för att förhindra null pointer exceptions
val möjligtNamn: String? = "Kalle"
möjligtNamn?.let {
    println("Namnet är $it")
}

// Objekt och enums för att hantera applikationskonfiguration och fördefinierade uppsättningar

// Singleton-objekt för globala inställningar
object Konfiguration {
    val url = "http://example.com"
    val timeout = 5000
}

// Användning av enum för att hantera en begränsad uppsättning av värden
enum class Färg {
    RÖD, GRÖN, BLÅ
}

// Definiera en konstant som inte ändras under programmets körning
const val PI = 3.14159

// Funktioner för att hantera specifika uppgifter och återanvändning av kod

// Enkel funktion för att hantera anslutning och färgval
fun användKonfigurationOchFärg() {
    println("Ansluter till ${Konfiguration.url} med timeout ${Konfiguration.timeout}")
    println("Favoritfärgen är ${Färg.BLÅ}")
}

// Beräknar summan av två tal och returnerar resultatet
fun beräknaSumma(x: Int, y: Int): Int {
    return x + y
}

// Funktion med högre ordning som tar emot en annan funktion som parameter
fun utförOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// Användning av funktioner för att demonstrera deras funktionalitet
val summa = beräknaSumma(5, 3)
val resultat = utförOperation(5, 3, ::beräknaSumma)
println("Summan är $summa, och resultatet av operationen är $resultat")

// Mer avancerade exempel på listhantering och funktionsuttryck

// Funktion som använder lambdauttryck för att filtrera och transformera listor
fun processaListan(listan: List<String>): List<String> {
    return listan.filter { it.length > 4 }.map { it.uppercase() }
}

// Exempel på användning av processad lista
val processadLista = processaListan(nummerLista)
println("Processad lista: $processadLista")

// Exempel på en när-listan map funktion för att para ihop element med dess index
val indexLista = nummerLista.mapIndexed { index, värde -> "$index: $värde" }
println("Listan med index: $indexLista")

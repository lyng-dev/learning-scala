1 > 2

1 < 2

1.0 <= 1.0

3.5f >= 3.6

'a' >= 'A'

val untrue = !true

val toBe = true

val question = toBe || !toBe


//shortcurcuits

def salt() = { println("salt"); false; }

def pepper() = { println("papper"); true; }

pepper() && salt()

salt() && pepper()

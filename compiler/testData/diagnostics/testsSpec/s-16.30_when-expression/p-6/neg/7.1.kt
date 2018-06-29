// !CHECK_TYPE

/*
 KOTLIN SPEC TEST (NEGATIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 6
 SENTENCE 7: The bound expression is of a sealed class type and all its possible subtypes are covered using type test conditions of this expression;
 NUMBER: 1
 DESCRIPTION: Checking for not exhaustive when when not covered by all possible subtypes.
 */

sealed class Expr
data class Const(val number: Int) : Expr()
data class Sum(val e1: Int, val e2: Int) : Expr()
data class Mul(val m1: Int, val m2: Int) : Expr()
object A: Expr() {}

sealed class Expr2
data class Const2(val number: Int) : Expr2()

sealed class Expr3
object A2: Expr3() {}

fun test1(value: Expr): Int = <!NO_ELSE_IN_WHEN!>when<!>(value) {
    is Const -> 1
    is Sum -> 2
    A -> 3
}

fun test2(value: Expr): Int = <!NO_ELSE_IN_WHEN!>when<!>(value) {
    is Const -> 1
    is Sum -> 2
    is Mul -> 2
}

fun test3(value: Expr): Int = <!NO_ELSE_IN_WHEN!>when<!>(value) { }

fun test4(value: Expr3): Int = <!NO_ELSE_IN_WHEN!>when<!>(value) { }

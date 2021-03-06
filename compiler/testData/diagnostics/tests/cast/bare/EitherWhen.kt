// !DIAGNOSTICS: -DEBUG_INFO_AUTOCAST
trait Either<out A, out B>
trait Left<out A>: Either<A, Nothing> {
    val value: A
}
trait Right<out B>: Either<Nothing, B> {
    val value: B
}

class C1(val v1: Int)
class C2(val v2: Int)

fun _when(e: Either<C1, C2>): Any {
    return when (e) {
        is Left -> e.value.v1
        is Right -> e.value.v2
        else -> e
    }
}
package test

public trait InheritNullability: Object {

    public trait Super: Object {
        public fun <A: CharSequence> foo(a: A)
    }

    public trait Sub: Super {
        override fun <B: CharSequence> foo(a: B)
    }
}

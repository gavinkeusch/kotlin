package server

import some.SomePackage

class Testing {
    void test() {
        SomePackage.<caret>foo(12);
    }
}

// INFO: <b>internal</b> <b>fun</b> foo(bar: kotlin.Int): kotlin.Unit <i>defined in</i> some<br/><p>KDoc foo<br/></p>
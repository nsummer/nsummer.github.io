function f2(f) {
    f(11);
}

function f1() {
    var a = "xx"
    f2(x => console.log(a))
    f2(x => console.log(x))

    console.log(x)
}

f1()
function f() {
    var x = "var a=3;var b=5;alert(a+b)"
    eval(x) // 执行完之后x就改变了成了数字
}
package com.example.firstapp.KT

fun main() {
    while (true) {
        println("======请输入你的表达式：=======")
        val input = readLine()
        try {
            input?.let {
                var ret: String = caculate(it)
                println("${input}=${ret}")
            }
            print("是否继续使用(y/n)")
            val cmd: String? = readLine()
            cmd?.let {
                if (it == "n") {
                    System.exit(-1)
                } else {
                    //继续使用

                }
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

}

fun caculate(input: String): String {

    if (input.contains("+")) {
        val nums = input.trim().split("+")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "+").toString()
    } else if (input.contains("-")) {
        val nums = input.trim().split("-")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "-").toString()
    } else if (input.contains("/")) {
        val nums = input.trim().split("/")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "/").toString()
    } else if (input.contains("*")) {
        val nums = input.trim().split("*")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "*").toString()
    } else {
        return "error你输入的表达式有误"
    }
}

fun operate(num: Double, num2: Double, operate: String): Double {
    return when (operate) {
        "+" -> num + num2
        "-" -> num - num2
        "/" -> num / num2
        "*" -> num * num2
        else -> 0.0
    }
}

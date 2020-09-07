package by.dziki.account_lite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication(scanBasePackages = ["by.dziki"])
class AccountLiteApplication

fun main(args: Array<String>) {
    runApplication<AccountLiteApplication>(*args)
}


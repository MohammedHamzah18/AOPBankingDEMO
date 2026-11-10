
package com.example.aopbankingdemo;

import com.example.aopbankingdemo.dao.AccountDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopBankingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopBankingDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO) {

        return runner -> {

            accountDAO.addAccount();

             accountDAO.depositMoney();

             accountDAO.withdrawMoney();
        };
    }
}

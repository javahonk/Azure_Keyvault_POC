package com.azure.keyvault.KeyVault;

import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.DeletedSecret;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;
import com.microsoft.azure.keyvault.KeyVaultClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@SpringBootApplication
@RestController
public class KeyvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyvaultApplication.class, args);
	}


/*
	public void run(String... varl) throws Exception {
		System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n",connectionString));
	}*/

}
package com.azure.keyvault.KeyVault;


import com.microsoft.azure.keyvault.KeyVaultClient;
import com.microsoft.azure.keyvault.models.SecretBundle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyvalultController {

    @Value("${azure.keyvault.client-id}")
    private String clientId;

    @Value("${azure.keyvault.client-key}")
    private String clientKey;

    @GetMapping("get")
    public String get() {
		/*String keyVaultUri =  "https://keyvalue-example.vault.azure.net";

		SecretClient secretClient = new SecretClientBuilder()
				.vaultUrl(keyVaultUri)
				.credential(new DefaultAzureCredentialBuilder().build())
				.buildClient();
		String secretName = "mySecret";
		String secretValue = "secrevalue";
		secretClient.setSecret(new KeyVaultSecret(secretName, secretValue));
		secretValue = "";
		System.out.println("Your secret's value is '" + secretValue + "'.");
		KeyVaultSecret retrievedSecret = secretClient.getSecret(secretName);
		System.out.println("Your secret's value is '" + retrievedSecret.getValue() + "'.");
		SyncPoller<DeletedSecret, Void> deletionPoller = secretClient.beginDeleteSecret(secretName);
		deletionPoller.waitForCompletion();*/

        // ClientSecretKeyVaultCredential is the implementation of KeyVaultCredentials
        KeyVaultClient client = new KeyVaultClient(
                new ClientSecretKeyVaultCredential(clientId, clientKey));

// KEYVAULT_URL is the location of the keyvault to use: https://yourkeyvault.vault.azure.net
// "testSecret" is the name of the secret in the key vault
        SecretBundle secret = client.getSecret( "https://keyvalue-example.vault.azure.net/", "testkey1" );
        System.out.println(secret.value());
        return connectionString;
    }

    private String connectionString = "defaultValue\n";
}

O https é como um certificado digital para acesso de informações na api, uma vez que o http é stateless (não guarda estados) o cliente deve a todo momento informar o seu token de usuario, oque gerar informações de rastreio na web que podem ser vistas com softwares como o wire shark. Para que não ocorra, nós utilizamos o OpenSSH, que cria e criptografa chaves publicas e privadas referentes aos tokens do usuário:
![[Pasted image 20250715155411.png]]

O HTTPS (Hypertext Transfer Protocol Secure) é uma versão segura do protocolo HTTP, que é utilizado para a troca de informações na web. A principal diferença entre eles é que o HTTPS utiliza criptografia para proteger os dados transmitidos entre o cliente (como um navegador) e o servidor.

Aqui estão os pontos principais sobre o HTTPS:

1. **Criptografia**: O HTTPS utiliza protocolos de segurança, como o SSL (Secure Sockets Layer) ou o TLS (Transport Layer Security), para criptografar os dados. Isso significa que as informações trocadas, como senhas e dados pessoais, são codificadas e não podem ser facilmente interceptadas por terceiros.
    
2. **Certificado Digital**: Para estabelecer uma conexão segura, o servidor apresenta um certificado digital ao cliente. Esse certificado contém informações sobre a identidade do servidor e a chave pública, que é usada para criptografar os dados.
    
3. **Chave Privada**: O servidor possui uma chave privada que é usada para descriptografar os dados recebidos. Essa chave nunca é compartilhada e permanece no servidor, garantindo a segurança das informações.
    
4. **Autenticação**: O uso do certificado digital também ajuda a autenticar a identidade do servidor, garantindo que o cliente está se conectando ao servidor correto e não a um impostor.
    
5. **Proteção de Dados**: Com o HTTPS, os dados trocados entre o cliente e o servidor estão protegidos contra ataques, como o "man-in-the-middle", onde um atacante tenta interceptar e ler as informações.
    

Em resumo, o HTTPS é essencial para garantir a segurança e a privacidade das informações na web, especialmente em transações que envolvem dados sensíveis.
#http 
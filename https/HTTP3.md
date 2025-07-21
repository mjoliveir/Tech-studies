Ao fim, temos o http3, a ultima evolução das versões de http. O http3 traz consigo o protocolo de transmissão QUIC, que é um udp "melhorado". O QUIC traz consigo o TLS (modulo de segurança e requerimento pra rodar https) já embutido. Oque otimiza o tempo de resposta. Ao contrario do http1.1 e 2, que primeiro fazem uma conexão tcp, depois uma tls e por fim enviam as mensagens utilizando https, o http3 faz tudo isso usando apenas o QUIC já com o tls embutido.
![[Pasted image 20250716103138.png]]
#http #http2 #http3

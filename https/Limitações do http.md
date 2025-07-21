**Requisiçoes sequenciais**
Quando nos mandamos uma request em http1.1 precisamos que a ela se encerre para que outra possa ser iniciada. Para que dois requests sejam feitos "ao mesmo tempo" precisamos de duas funções TCP agindo paralelamente, problema que foi resolvido em http2 com o fator de multiplexação, onde é otimizado os numeros de conexões TCP.

**Cabeçalhos textuais**
No http1.1, os cabeçalhos eram textuais, oque causava problemas de desempenho. Já no http2 os cabeçalhos são todos compactados em um arquivo binario, oque otimiza a leitura por parte da maquina.

**Requests obrigatorios**
O servidor no http1 nao possui proatividade mesmo com requests obrigatórios num site, por exemplo: o cliente ainda precisa realizar a requisição elementos crucias do website, como elementos do frontend e etc. no http2 todos os elementos que de alguma forma já seriam requeridos pelo cliente para o servidor são entregues antes mesmo do cliente pedir, isso ocorre com a feature Server Push.
#http #http2


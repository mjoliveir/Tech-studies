

Encapsulamento é um dos pilares fundamentais da Programação Orientada a Objetos (POO), ao lado de herança, polimorfismo e abstração. Ele tem como objetivo principal proteger os dados internos de um objeto e controlar como esses dados são acessados ou modificados.

Na prática, o encapsulamento é alcançado por meio da definição de atributos privados e da exposição de métodos públicos para manipulá-los. Isso significa que os dados de um objeto não são acessados diretamente de fora da classe, mas sim através de métodos que garantem a integridade e coerência desses dados.

Por exemplo, considere uma classe `ContaBancaria`. Seus atributos, como `saldo`, devem ser privados para evitar alterações diretas. Em vez disso, metodos como `depositar()` e `sacar()` devem ser utilizados para modificar o saldo, permitindo que regras de negócio, como a impossibilidade de sacar mais do que o saldo disponível, sejam respeitadas.

O encapsulamento promove a manutenção do código, pois a implementação interna das classes pode mudar sem afetar o funcionamento externo, desde que a interface (os métodos públicos) permaneça a mesma. Além disso, melhora a segurança e confiabilidade do software, reduzindo a chance de erros causados por manipulações indevidas dos dados.

Portanto, o encapsulamento é uma prática essencial para garantir a robustez e a organização dos sistemas orientados a objetos, facilitando tanto o desenvolvimento quanto a evolução dos softwares.

[[4 - Programação Orientada a Objetos (POO) em Java]]
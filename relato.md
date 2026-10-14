# relato.md

## Parte 3 — Referências para objetos

### Pergunta 1
**O que acontecerá se fizermos `carro4.acelerar();`? Qual será a velocidade de `carro1`?**
A velocidade do `carro1` vai aumentar em 10 km/h também (vai para 120 km/h). Isso acontece porque os dois estão apontando pro mesmo lugar.

### Pergunta 2
**Quantos objetos Carro existem depois da instrução `Carro carro4 = carro1;`?**
Continuam existindo apenas **3 objetos** criados com o `new`. 

### Pergunta 3
**`carro4` é uma cópia de `carro1`? Justifique.**
**Não.** Ele não cria um carro novo. No Java, essa linha só faz a variável `carro4` apontar para o mesmo endereço de memória que o `carro1` já estava usando. São dois nomes mexendo no mesmo carro.

---

## Parte 4 — Utilizando null

### Pergunta 4
**O que acontece? Identifique a exceção produzida pelo Java.**
O programa quebra e dá o erro **`NullPointerException`**. Isso acontece porque a variável tá vazia (`null`), aí o Java não encontra nenhum objeto para conseguir acelerar.

---

## Parte 6 — Objetos como parâmetros

### Pergunta 5
**O que foi passado para o método `trocarCarro`? Explique com suas palavras.**
Foi passada uma **referência para o objeto** (o endereço dele na memória). O Java passa o controle do objeto que criamos no principal direto para o método do motorista conseguir mexer nele.

---

## Parte 8 — static

### Pergunta 6
**Por que não precisamos fazer `carro.getQuantidade();` para obter a quantidade?**
Porque o método foi criado como **`static`**. Isso significa que ele é um método da classe inteira e não de um carro específico, então dá para chamar direto usando `Carro.getQuantidade()`.

### Pergunta 7
**A variável quantidade pertence a cada objeto ou à classe Carro?**
Pertence à **classe Carro**. Como ela é static, existe só uma variável global na memória compartilhada por todos os carros para conseguir contar o total certinho.

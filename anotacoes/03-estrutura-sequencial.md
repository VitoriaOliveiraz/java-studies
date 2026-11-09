# ⚡ 03 · Estrutura Sequencial, Entrada/Saída, Casting e Prática

> **Curso:** Curso Java primeiros passos: Lógica de Programação e Algoritmos (Prof. Dr. Nelio Alves)  
> **Capítulo:** Estrutura sequencial (Material de apoio: `03-estrutura-sequencial.pdf`)  
> **Período das anotações:** 18/10/2026 a 04/11/2026  
> **Autora:** Sra. Oliveira  
> **Padrão:** Anotações manuscritas preservadas na íntegra + dados dos slides, fórmulas, exercícios do Beecrowd e complementações fluidas do Javi (`> 🌻 Complemento do Javi:`).

---

## Pág. 1 · Capa

**Java · CAP. 3**

---

## Pág. 2 · 18/10/2026 · Visão Geral e Expressões Aritméticas

Começando o segundo capítulo  
- Representaram subtítulos

**Visão geral Estrutura Sequencial**
- Recursos Básicos para programas simples
- Expressões aritméticas
- Variáveis e tipos básicos
- Três OPERAÇÕES (Entrada - processamento de DADOS - Saída)
- Funções matemáticas

- Algoritmos precisam de sequência lógica
- Próximo de exercícios práticos
- teve material de apoio

> 🌻 **Complemento do Javi:**
> 
> O nome **Estrutura Sequencial** existe para enfatizar que os comandos executam estritamente em sequência, de cima para baixo. Se você tentar calcular `soma = x + y;` antes de ler o valor de `x` e de `y`, o programa não vai adivinhar o que você quer e vai dar erro. A ordem cronológica dos comandos é a base de tudo.

---

### 22/10 · Expressões Aritméticas
- **[Dúvida]** Expressão aritmética é conta normal? Me explicar de um jeito mais simples
- São expressões quando calculadas retornam números
- São cálculos comuns
- Mais (`+`), Menos (`-`), multiplicação (`*`), Divisão (`/`), Resto (`%`)
- Tem prioridades: 
  - 1º lugar: `*`, `/`, `%`
  - 2º lugar: `+`, `-`
  - Mesma prioridade segue o rumo (esquerda → Direita)
  - Parênteses coloca prioridade na expressão. É apenas parênteses.
- Precedência = Prioridade

### Dados dos Slides (Exemplos de Expressões e Precedência):
- `2 * 6 / 3` → `12 / 3` → **Resultado = 4**
- `3 + 2 * 4` → `3 + 8` → **Resultado = 11**
- `(3 + 2) * 4` → `5 * 4` → **Resultado = 20**
- `60 / (3 + 2) * 4` → `60 / 5 * 4` → `12 * 4` → **Resultado = 48**
- `60 / ((3 + 2) * 4)` → `60 / 20` → **Resultado = 3**

**O Operador `%` (*mod* ou resto da divisão inteira):**
- `14 % 3` → Resultado = **2** (pois 14 dividido por 3 dá 4 e sobram 2).
- `19 % 5` → Resultado = **4** (pois 19 dividido por 5 dá 3 e sobram 4)

> 🌻 **Complemento do Javi:**
> 
> **Expressão aritmética é conta normal?**  
> Sim, exatamente a conta do lápis e papel! A palavra "expressão" só quer dizer uma fórmula que, quando o processador termina de calcular, vira um único valor numérico.
> 
> O operador `%` (*mod*) parece estranho no começo, mas ele é o melhor amigo do programador backend:
> - Quer saber se um número é par? `numero % 2 == 0`.
> - Quer saber se um ano é bissexto? Usa `% 4` e `% 400`.
> - Quer converter segundos em minutos? A divisão `/ 60` dá os minutos e o resto `% 60` dá os segundos que sobraram no relógio!

---

### Variáveis · Tipos Básicos em Java
- Variáveis são um pequeno espaço na memória RAM, armazena DADOS durante a execução de programas
- Variáveis em Java obedecem uma sintaxe:
  - `<tipo> <nome> = <valor inicial>;` *(valor inicial: opcional)*

---

## Pág. 3 · 22/10 · Tipos Básicos e Memória RAM

- `int` = números inteiros (`10`)
- `double` = número com ponto flutuante (`1.80`)
- `char` = Recebe apenas um caractere (`'J'`)
- *(chave ligando os três)* Tem mais
- Variáveis também possuem um endereço na memória RAM
  - [Comentário: Em geral o professor disse que veremos futuramente.]
  - [Comentário: Mas basicamente é que toda variável tem uma "casa" na memória.]

### Tabela de Tipos Primitivos em Java (Dados dos Slides)
[Comentário: nunca que eu iria copiar isso na mão]

| Descrição | Tipo | Tamanho | Faixa de Valores | Valor Padrão |
|---|---|---|---|---|
| Inteiro minúsculo | `byte` | 8 bits (1 byte) | -128 até 127 | `0` |
| Inteiro curto | `short` | 16 bits (2 bytes) | -32.768 até 32.767 | `0` |
| Inteiro padrão | `int` | 32 bits (4 bytes) | -2.147.483.648 até 2.147.483.647 | `0` |
| Inteiro longo | `long` | 64 bits (8 bytes) | -9 quintilhões até +9 quintilhões | `0L` |
| Decimal simples | `float` | 32 bits (4 bytes) | ±1,4E-45 até ±3,4E+38 | `0.0f` |
| Decimal duplo | `double` | 64 bits (8 bytes) | ±4,9E-324 até ±1,7E+308 | `0.0` |
| Caractere Unicode | `char` | 16 bits (2 bytes) | `'\u0000'` até `'\uFFFF'` | `'\u0000'` |
| Verdadeiro/Falso | `boolean` | 1 bit | `true` ou `false` | `false` |

`String` - cadeia de caracteres (palavras ou textos entre aspas duplas `"..."`).  
Exemplo Unicode: `'a'` = `'\u0061'`.

- **[Dúvida]** Realmente usa tudo isso?
- [Comentário: tenho que testar]

> 🌻 **Complemento do Javi:**
> 
> **"Realmente usa tudo isso?"**  
> No mercado corporativo: **não!**
> 
> Você vai passar 90% da sua carreira de backend usando apenas:
> 1. `int` para quantidades, idades, posições de lista.
> 2. `long` para IDs de banco de dados (chaves primárias).
> 3. `double` para métricas e cálculos físicos.
> 4. `boolean` para validações e regras de negócio.
> 5. `String` para textos, nomes, senhas e endereços.
> 
> `byte` e `short` são resquícios das décadas de 70 e 80, quando computadores tinham poucos kilobytes de RAM. Hoje só são usados para ler arquivos binários brutos (como fotos ou áudio) ou protocolos de rede ultra-rápidos.

### Padrões de Nomes de Variáveis
- Começar sempre com letra ou sublinhado `_` (nunca com dígito)
- Sem acentos ou til (evite `salário`)
- Sem espaço em branco
- Padrão **camelCase** (ex.: `salarioDoFuncionario`, `metroQuadrado`)

### Três Operações Básicas
- **Entrada** (ou leitura de dados): Usuário / Teclado → Programa (guarda na RAM)
- **Processamento** de dados: Programa realiza cálculos via comando de **atribuição**
- **Saída** de dados (ou escrita): Programa → Tela / Console

---

## Pág. 4 · 22/10 e 23/10 · Saída de Dados e Casting

### Saída de Dados no Console (`System.out`)
- Foram amostras de sout de variáveis com diferentes tipos de dados.
- [Comentário: Essa[?] pra limitar as casas decimais é assim?! `"%.2f%n"` ??!!]
- [Comentário: Classe Locale (tá depreciado?)]
- Concatenação com `+`
- Diferentes prints do Java - Rever
  - Que tanto de porcento!
  - `%f` - ponto flutuante (decimal)
  - `%d` - inteiro (*digit*)
  - `%s` - texto (*string*)
  - `%n` - quebra de linha independente de plataforma
  - [Comentário: Tem mais? Não tem um `'${t}'`?]

> 🌻 **Complemento do Javi:**
> 
> 1. **O susto do `"%.2f%n"`:** O `%` avisa ao Java: *"prepare-se para encaixar uma variável aqui"*. O `.2` diz *"duas casas após a vírgula"*. O `f` avisa que é *floating point* (decimal). E o `%n` pula a linha com elegância no Windows, Linux e Mac.
> 2. **O `Locale`:** No Java 19 em diante, o construtor `new Locale("en", "US")` ficou obsoleto. O jeito moderno é usar a constante pronta `Locale.US`. O comando `Locale.setDefault(Locale.US);` garante que o Java leia e imprima números decimais com ponto (`53.235`) e não com vírgula (`53,235`).
> 3. **Interpolação `${t}`:** Linguagens como JavaScript e Python têm `${variavel}` ou `f"{variavel}"`. O Java sempre foi mais formal: no console usamos `printf` ou concatenação com `+`.

---

### Exercício de Fixação (Slide 17 do PDF)

```java
import java.util.Locale;

public class ExercicioFixacao {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
```

---

### Processamento de Dados em Java e Casting
- Comando de atribuição: `<variável> = <expressão>;` (lê-se: *"variável recebe expressão"*)
- **Regra:** Primeiro a expressão da direita é inteiramente calculada; depois o valor resultante é armazenado na variável da esquerda.
- Boa prática em ponto flutuante: sempre use `.0` para `double` (ex.: `2.0`) e `f` para `float` (ex.: `2f`).
- Vemos do casting.
- **[Dúvida]** Casting é válido? Parece até forçado...

> 🌻 **Complemento do Javi:**
> 
> É forçado por pura necessidade lógica! 
> 
> Se você declarar duas variáveis inteiras `int a = 5; int b = 2;` e fizer `double resultado = a / b;`, o resultado será `2.0` e **não** `2.5`. 
> 
> **Por que isso acontece?** Porque o compilador Java enxerga `5` (inteiro) dividido por `2` (inteiro). A regra do Java diz: *divisão de inteiros sempre gera número inteiro*. Ele descarta a sobra decimal! 
> 
> Para consertar isso, usamos o **Casting** (conversão explícita):
> ```java
> double resultado = (double) a / b; // Agora sim resulta 2.5!
> ```
> O `(double)` força a conversão do valor de `a` para decimal antes de realizar a divisão.

---

## Pág. 5 · 25/10 · Organização de Pastas no IntelliJ e Conflito de Classes

- [Comentário: 25/10 - Estou sem luz então fui fazer o Exercício.]

### Notas dos Exercícios
- No início eu tentei criar um novo diretório, mas deu um ERRO.
- Imagem: projeto `java-studies`, pastas `dio-bootcamp-itau/src/Main` e `udemy/src/Main`, os dois `Main` circulados em vermelho.
- Eu não entendo muito de organização de pastas em Java.
- Pelo erro, o nome das classes está duplicado.
- Mas faz sentido, eu coloquei as duas como `Main`.
- Troquei o nome e deu certo. Vou ver no Antigravity (JAVI) como melhorar a estrutura e nomenclatura das pastas.
- `char` só é declarado com aspas simples (`'F'`).

> 🌻 **Complemento do Javi:**
> 
> **O mistério das classes duplicadas no IntelliJ:**
> No ecossistema Java, as pastas dentro do diretório `src` não são meras pastas organizadoras; elas definem o **Pacote** (*Package*) da classe.
> 
> Se você tem duas classes chamadas `Main` soltas na raiz do `src`, o compilador entra em curto-circuito porque o identificador único de uma classe é seu nome completo. 
> 
> Para resolver isso com elegância profissional, colocamos no topo do arquivo a instrução de pacote:
> ```java
> package dio; // esta mora no pacote dio
> public class Main { ... }
> ```
> e na outra:
> ```java
> package udemy; // esta mora no pacote udemy
> public class Main { ... }
> ```
> Assim o Java enxerga perfeitamente `dio.Main` e `udemy.Main` sem nenhum conflito!

---

## Pág. 6 · 28/10 e 03/11 · Entrada de Dados com Scanner

### 03/11/2026 · Entrada de Dados pt. 1
- `Scanner`: Introdução ao Scanner
  - Scanner: um objeto do tipo Scanner
- **[Dúvida]** Como assim objeto Scanner?
- **[Dúvida]** Ele é uma lib?
- Nós importamos o Scanner para usar ele: `import java.util.Scanner;`
- Fiz um código prático do Scanner:
- **[Dúvida]** Por que tem que usar `new`?
  - `Scanner sc = new Scanner(System.in);`
- **[Dúvida]** Acho que esse trem tá depreciado?
- **[Dúvida]** Será que não tem maneira melhor?

### O seu código de teste (`ExercicioTestes.java`):
```java
import java.util.Scanner;

public class ExercicioTestes {
    public static void main(String[] args) {
        Scanner dataName = new Scanner(System.in);
        String nome;
        nome = dataName.next();
        System.out.println("Seu nome é: " + nome);
        dataName.close();
    }
}
```

- [Comentário: Aparentemente esse .next é só pra texto]
- [Comentário: Estou vendo outras versões]
- 💡 Seria legal ter assim que iniciarmos um projeto, perguntar o nome e rodar um "Seja bem-vindo!" só por recepção.
- [Comentário: Pelo que eu vejo tem diversas opções de .next]
- Usamos:
  - `sc.next()` → lê uma palavra (para no espaço)
  - `sc.nextInt()` → lê um número inteiro
  - `sc.nextDouble()` → lê um número com ponto flutuante
  - `sc.next().charAt(0)` → lê uma palavra e pega a primeira letra (caractere no índice 0)
- Vi um erro ao VIVO!

> 🌻 **Complemento do Javi:**
> 
> **Respondendo às suas dúvidas capitais:**
> 1. **O Scanner é uma lib? O que é um objeto?**  
>    O `Scanner` pertence à biblioteca padrão do Java (`java.util`). Uma **Classe** é uma planta de arquitetura; um **Objeto** é a casa construída. Quando escrevemos `new Scanner(System.in)`, estamos pedindo ao Java: *"construa para mim na memória RAM um objeto leitor conectado ao teclado (`System.in`)"*.
> 2. **Por que usar `new`?**  
>    Tipos primitivos (`int`, `double`) cabem direto em gavetinhas pequenas da memória. Objetos complexos precisam ser instanciados (*alocados*) dinamicamente na memória RAM. A palavra reservada `new` faz essa alocação.
> 3. **Está depreciado? Tem maneira melhor?**  
>    O `Scanner` **não** está depreciado! Ele é a ferramenta oficial e didática mais simples para ler dados do terminal. No backend corporativo não lemos teclado porque as aplicações rodam em servidores na nuvem recebendo requisições HTTP (arquivos JSON enviados por navegadores e aplicativos móveis). Mas para lógica e terminal, o `Scanner` reina absoluto.

---

## Pág. 7 · 03/11 · Scanner pt. 2 (O Bug do Buffer) e Funções Matemáticas

### Entrada de dados - Parte 2
- Ler um texto ("Até a quebra de linha")
- **[Dúvida]** Como assim?
- Acho que eu entendi.
- O método usado: `sc.nextLine();`
- O professor mostrou a diferença de esperar com o `nextLine()` e `next"tipo"` porque ele vai contar a quebra de linha.

> 🌻 **Complemento do Javi:**
> 
> **A Pegadinha Clássica do Buffer Pendente:**
> Quando você digita a sua idade e aperta `Enter`:
> 1. Você digitou: `30` + `Enter` (`\n`).
> 2. O `sc.nextInt()` lê o número `30`, mas deixa o `Enter` esquecido na fila do teclado (*buffer*).
> 3. Se você chamar um `sc.nextLine()` em seguida para ler o nome da rua, ele encontra aquele `Enter` sobrando, acha que você apertou `Enter` com uma linha em branco e pula sem esperar você digitar!
> 
> **A Solução Elegante:**
> Sempre que usar `nextInt()`, `nextDouble()` ou `next()` e logo depois for usar um `nextLine()`, coloque um `sc.nextLine()` vazio no meio só para consumir a quebra de linha pendente:
> ```java
> int idade = sc.nextInt();
> sc.nextLine(); // "Limpa a garganta" do leitor, consumindo o Enter pendente!
> String nomeCompleto = sc.nextLine(); // Agora sim espera o usuário digitar!
> ```

---

### Funções Matemáticas em Java (`java.lang.Math`)
- [Comentário: Eu sei o que é!! São funções do .Math. Acho que tem em toda linguagem]
- [Comentário: Não vou decorar porque isso deve ter anotado em alguma doc.]
- [Comentário: Os exemplos do professor: `sqrt(valor)`, `pow(valor x, valor y)`]
- [Comentário: Vou SÓ VER!! Não acho que eu vá usar isso, mas pelo menos eu sei]

### Funções Principais Trazidas pelos Slides:
| Função | Significado | Exemplo |
|---|---|---|
| `Math.sqrt(x)` | Raiz quadrada (*Square Root*) | `Math.sqrt(25.0)` → `5.0` |
| `Math.pow(x, y)` | Potenciação ($x^y$) | `Math.pow(4.0, 2.0)` → `16.0` |
| `Math.abs(x)` | Valor absoluto (módulo, sem sinal negativo) | `Math.abs(-10.0)` → `10.0` |

### Exemplo dos Slides: Fórmula de Bhaskara Completa
$$\Delta = b^2 - 4ac$$
$$x = \frac{-b \pm \sqrt{\Delta}}{2a}$$

Em Java:
```java
double delta = Math.pow(b, 2.0) - 4 * a * c;
double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
```

---

## Pág. 8 · 03/11 · Exercício Resolvido 01, Debug e URI Online Judge

### Exercício Resolvido 01 (Problema do Terreno)
- [Comentário: Gente... Ele colocou exercício com matemática, me lasquei..KKK]
- [Comentário: Legal ele ajuda a decompor o problema!! Tenho problemas com isso. Seria interessante aprender isso melhor]
- [Comentário: Ele fez de um jeito melhor do exemplo anterior do Scanner:]
  - `double largura = sc.nextDouble();`
  - [Comentário: Eu sabia que tinha um jeito mais simples!]
- Tivemos uma sequência de passos: **Entrada de dados → Processamento → Saída de dados**.

```java
import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1. Entrada
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        // 2. Processamento
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        // 3. Saída
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
```

---

### Como Utilizar o Debug
- O professor usa o Eclipse, mas nós usamos o IntelliJ.
- Conceito de **Breakpoint:** ponto vermelho onde a execução congela para inspecionarmos as variáveis na memória RAM.
- **No Eclipse:** Tecla `F6` avança linha a linha.
- **No IntelliJ:** Tecla **`F8`** (*Step Over*) avança linha a linha. O botão de besouro verde ao lado do botão de Play inicia a depuração.

---

### Nosso Primeiro Exercício no URI Online Judge
- O site antigo que o professor cita mudou de nome: agora se chama **beecrowd**!
- Cuidados para não tomar erro no juiz online:
  - `Wrong Answer` (resposta errada nos cálculos).
  - `Presentation Error` (esquecer de pular linha ao final ou colocar espaços extras onde não devia).

---

## Págs. 9 e 10 · 03/11 e 04/11 · Mapa dos Exercícios do Beecrowd

- [Comentário: 04/11 - Fiz só até 1014, nossa cansei. Ficou faltando 1016, 1017 e 1005, 1006.]
- [Comentário: Reparei que tem muita matemática :']
- [Comentário: tô bem mais cansada hoje → 04/11 → 22:56 PM]

### ✅ Exercícios Já Implementados no Repositório (em `udemy/src/`):
- `Exercicio1001.java` → Extremamente Básico (Soma de inteiros `A + B`).
- `Exercico1002.java` → Área do Círculo ($A = \pi \cdot R^2$ com $\pi = 3.14159$).
- `Exercicio1003.java` → Soma Simples.
- `Exercicio1004.java` → Produto Simples.
- `Exercio1007.java` → Diferença ($A \cdot B - C \cdot D$).
- `Exercicio1008.java` → Salário do Funcionário (horas trabalhadas $\times$ valor da hora).
- `Exercicio1010.java` → Cálculo Simples de Peças.
- `Exercicio1014.java` → Consumo médio de combustível ($km / litros$).
- `ExercicioTestes.java` → Laboratório prático da Sra. Oliveira.

---

### 📋 Exercícios Pendentes Mapeados (Para Praticar aos Poucos):

#### Parte 1:
- `1005` e `1006` → Média Ponderada (pesos das notas).
- `1016` → Distância entre dois carros (velocidade relativa).
- `1017` → Gasto de Combustível em viagem.

#### Parte 2:
- `1009` → Salário com Bônus (leitura de `String` com comissão de vendas).
- `1011` → Esfera ($\frac{4}{3} \cdot \pi \cdot R^3$ com *casting* na divisão `4.0 / 3`).
- `1012` → Áreas geométricas (triângulo, círculo, trapézio, quadrado, retângulo).
- `1013` → O Maior (fórmula com `Math.abs`: $\frac{a + b + \text{abs}(a - b)}{2}$).
- `1015` → Distância entre dois pontos ($\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$ com `Math.sqrt` e `Math.pow`).

#### Parte 3 (Desafios com `%` e Lógica de Divisão):
- `1018` → Decomposição de Cédulas (quantas notas de 100, 50, 20, 10, 5, 2 e 1 com operador `%`).
- `1020` → Idade em Dias (conversão para anos, meses e dias com `% 365` e `% 30`).
- `1021` → Notas e Moedas (desafio de precisão e *casting*).
- `1061` → Tempo do Evento (dias, horas, minutos e segundos).

> 🌻 **Complemento do Javi:**
> 
> Parabéns pelo ritmo e pela disciplina, Sra. Oliveira! Você já codificou 8 exercícios completos direto no IntelliJ e deixou o seu raciocínio registrado com total sinceridade. 
> 
> Não precisa ter pressa para resolver todos os pendentes de uma vez só: nós iremos atacando esses desafios nos nossos próximos encontros. O seu repositório agora tem uma base de documentação que poucos desenvolvedores juniores conseguem apresentar!

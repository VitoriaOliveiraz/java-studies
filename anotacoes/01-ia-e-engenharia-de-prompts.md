# 🧠 01 · Fundamentos de IA, Engenharia de Prompts e Ambiente Java

> **Data das anotações:** 15/10/2026  
> **Autora:** Sra. Oliveira  
> > **Curso:** Bootcamp DIO-Itau
> **Padrão:** Anotações originais preservadas na íntegra + complementações técnicas e didáticas do Javi (`> 🌻 Complemento do Javi:`).

---

## Página 1 · Capa

Girassóis, título escrito à mão: "Java", com uma florzinha amarela desenhada ao lado.

---

## Página 2 · Notas: Como a IA nasceu?

- **[Dúvida]** Como assim tokens? O que são tokens? Nós consumimos tokens e a IA também?

**Termos importantes:**
- Machine Learning
- Processamento de Linguagem Natural (PLN)
- Modelos de linguagem
- Parâmetros de reconhecimento
- Reconhecimento de padrões
- A IA precisa de treinamento (pode demorar mais que o esperado)
- IA funciona sobre matemática pura e dados
- Grandes Modelos de Linguagem (LLM) -> tipo as big techs (GPT, Claude)
- Pequenos Modelos de Linguagem (SLM) -> mais pequenos e funcionais
- 💡 Criar uma IA que entende de carros, no caso uma SLM
- IA é uma cópia da inteligência humana
- Deep Learning (Aprendizado profundo) - Como uma rede *(desenho de uma rede ao lado)*
- Neurônios Artificiais que criam conexões por padrões
- IAs Multimodais (Muitos modelos)
  - ↳ Contextos profundos com várias camadas e assimilações
- IA Generativa -> produz algo novo e não apenas usufrui dos dados que tem

> 🌻 **Complemento do Javi:**
> 
> **Desvendando os Tokens:**
> Computadores não leem palavras como nós lemos; eles só entendem números. Quando você digita uma frase para uma IA, um programa chamado *tokenizer* (fatiador) quebra o texto em pedacinhos chamados **tokens**.
> 
> Um token pode ser uma palavra inteira (para palavras comuns como "sol" ou "gato") ou pedaços de sílabas (como "computa" + "dor"). Em média, 100 palavras em português equivalem a cerca de 130 a 140 tokens.
> 
> **Quem consome tokens?**
> Nós consumimos quando *enviamos* (tokens de entrada / *input*) e a IA consome quando *responde* (tokens de saída / *output*). É por isso que serviços de IA cobram por milhão de tokens processados.
> 
> **Sua ideia da SLM automotiva (💡):**
> Você teve uma visão que virou tendência fortíssima na indústria! Hoje as empresas perceberam que treinar uma LLM gigantesca (com bilhões de parâmetros que sabem de receita de bolo até astrofísica) gasta milhões de dólares à toa para tarefas específicas. As SLMs (*Small Language Models*), como o Phi da Microsoft ou o Gemma do Google, rodam até no celular ou no computador de bordo de um carro, consumindo pouquíssima energia e sendo especialistas em um só assunto.

---

## Página 3 · De Chatbots a Agentes, o caminho que vamos percorrer

**Conceitos Básicos ❓**
- **Chatbot** -> perguntas e respostas por chats
- **Copiloto** -> te ajuda sugerindo melhorias (palpiteiro executante - fala e também faz)
- **Agentes** -> proletarizados, só fazem o serviço

**Chatbots:**
- Funciona à base de bons prompts (boas perguntas)
  - ↳ Nem sempre são inteligentes, em parte você deve guiá-lo. Sempre limitado ao chat

**Copilotos:**
- Normalmente um colega palpiteiro e analítico. Gosto de pensar que ele analisa com um contexto bem. Como o Gemini no Docs, o Copilot no VSCode -> são úteis para além das perguntas. Podemos ir adaptando, recusando e aceitando palpites. Sempre vão precisar de um revisor humano. *(desenho de uma mulher de cabelo black power com brincos amarelos)*

**Agentes:**
- Possuem um contexto maior e trabalham sobre ele
- Podem ser mais abrangentes e de diferentes tópicos
  - ↳ Para códigos, são os mais famosos (Codex, Claude Code), ao meu ver
- Mais autônomo que os copilotos (com as limitações que o usuário colocar)
- Cria, modifica, **"apaga"** também *(circulado em vermelho)*
- Mesmo que só tenha uma LLM é importante que molde e vá adaptando ao que precisa
- Importante saber onde e quando vale aplicar os agentes e se vale a pena 🌻

[Comentário: Testar depois com Antigravity e roadmap de estudos site, para o teste simples a intenção é detalhar um roadmap mais simples para leigos e iniciantes como eu.]

- **[Dúvida]** Dá pra usar o Antigravity em site?
- 💡 *(Na margem)* Aplicar com as minhas anotações ↓ Exportar arquivos

> 🌻 **Complemento do Javi:**
> 
> A sua divisão entre Chatbot, Copiloto e Agente ficou perfeita! 
> 
> A virada de chave do **Agente** é que ele não fica preso ao texto: ele tem **ferramentas** (*tools*). Um chatbot só cospe texto; um agente como eu consegue rodar comandos no terminal, inspecionar seus diretórios, ler arquivos de código e propor alterações estruturadas.
> 
> **Sobre o Antigravity em sites:**
> O Antigravity é uma plataforma focada no ambiente de desenvolvimento integrado (IDE e terminal) para engenharia de software e automação local. Para integrar capacidades semelhantes em um site ou aplicação web comercial, o caminho de mercado é expor uma API backend (em Java com Spring Boot, por exemplo) que consome os serviços de IA e devolve as respostas para uma interface web.

---

## Página 4 · Engenharia de Prompts

- **[Dúvida]** Essa parte precisa de atenção e uma explicação melhor

**Por que aprender esse tema:**
- Pelas IAs terem um grande contexto (LLM) e com muitas probabilidades de seguimento, a imprecisão faz com que a solicitação precise ser bem mais precisa, clara e organizada
- Processamento de linguagem natural

**Como elas (IAs) entendem os prompts?**
- O que é arquitetura Transformer?
- Imagino que a forma que a IA é treinada impacta
  - ↳ Quando for treinar a minha, testar diferentes formas
- Busca um sentido para as afirmações

Ex: *Cátia deixou o livro porque não achou interessante.*  
↳ As perguntas podem ser:
- Quem é Cátia?
- Por que o livro não é interessante?
↳ Buscar trechos relevantes

**Como é processado?**
- **[Dúvida]** Como assim tokens?
- Convertem o texto em tokens

**Como elas lembram?**
- Mantêm uma pequena caixa de memória. Quando a caixa começa a encher e ainda tem mais coisa vindo, ela elimina as coisas mais velhas e segue com o contexto nesse mesmo processo.

**Como é um bom prompt? E o que ele tem?**
- **I**nstrução inicial ← I
- **C**ontexto adequado → C
- **E**xemplos ← **Fatality"**
- **D**ados de entrada ←Deu
- **F**ormato da saída ← Fatality

> 🌻 **Complemento do Javi:**
> 
> **O que é a Arquitetura Transformer?**
> Até 2017, as IAs liam textos palavra por palavra, em fila. Se a frase fosse longa, quando chegavam ao final já tinham esquecido o começo. 
> 
> Em 2017, pesquisadores do Google publicaram um artigo histórico chamado *"Attention Is All You Need"* (Atenção é tudo o que você precisa), criando os **Transformers**. O grande segredo do Transformer é o mecanismo de **atenção**: ele lê a frase inteira de uma vez e calcula matematicamente o peso da relação entre cada palavra. No seu exemplo (*"Cátia deixou o livro porque não achou interessante"*), o Transformer conecta instantaneamente a palavra *"interessante"* com *"livro"*, e *"achou"* com *"Cátia"*.
> 
> **A sua "Caixa de Memória" (Janela de Contexto):**
> A sua analogia da caixa é cirúrgica. Na computação chamamos isso de **Janela de Contexto** (*Context Window*). Toda IA tem um limite máximo de tokens que consegue "enxergar" ao mesmo tempo. Se a conversa fica longa demais, o início da conversa cai para fora da caixa, a menos que o sistema resuma ou armazene arquivos persistentes (como fazemos no nosso projeto).
> 
> E o seu mnemônico **"I Cê Deu Fatality"** (**I**nstrução, **C**ontexto, **E**xemplos, **D**ados, **F**ormato) é digno de livro de engenharia de software! Ele resume as melhores práticas mundiais de direcionamento de modelos.

---

## Página 5 · Agente DIO e Configuração do Ambiente Java

- *(Na margem)* Pesquisar mais: Harness -> Um agente que tem diferentes salas, cada sala é um curso. E o agente é o professor.?

[Comentário: Eu criei a partir do agente da DIO um pra mim e adaptei pra que ficasse minha cara, adaptei.]

**Configuração do ambiente Java ♥**
- Vi diferentes IDEs como IntelliJ, Eclipse e VSCode
- Realizei o download do Maven e do Gradle, tanto de maneira engessada, e com o SDK
- Preferi realizar o download puramente com o SDKMAN
- Criei meu próprio agente de estudos e dei a ele o nome de **Javi** ♥
- Tive uma análise (Builders) -> **[Dúvida]** Precisa de mais explicações
- Até aqui tem sido na DIO. Depois daqui é um curso complementar da Udemy. Mas por quê? O conteúdo da DIO é um pouco raso e quis complementar com este. Qual é? *Curso Java primeiros passos: Lógica de Programação e Algoritmos* do Prof. Dr. Nelio Alves.

> 🌻 **Complemento do Javi:**
> 
> **O que são Builders (Maven e Gradle)?**
> No início do aprendizado, para rodar um código pequeno, o IntelliJ compila tudo num clique. Mas em um projeto comercial de verdade, o código tem centenas de arquivos, precisa rodar testes automatizados e depende de bibliotecas externas (para conectar no banco de dados, enviar e-mails, gerar PDFs).
> 
> Fazer isso na mão seria um pesadelo: você teria que baixar dezenas de arquivos `.jar` na internet e configurar tudo manualmente.
> 
> É aí que entram os **Builders** (ferramentas de automação de compilação):
> - **Maven:** O clássico mais adotado em empresas consolidadas. Usa um arquivo chamado `pom.xml` onde você apenas lista o nome da dependência que quer, e o Maven baixa da internet, confere a versão, roda seus testes e empacota o seu programa final num arquivo `.jar`.
> - **Gradle:** A evolução mais moderna, muito rápida e flexível, padrão no desenvolvimento Android e em projetos Spring Boot modernos.
> 
> **Sua escolha pelo SDKMAN:**
> Usar o **SDKMAN** para gerenciar as versões do Java e das ferramentas é a escolha mais elegante e profissional que existe no ecossistema Unix/Linux e WSL. Ele evita conflitos de variáveis de ambiente no sistema operacional e permite trocar de versão do Java com um único comando.

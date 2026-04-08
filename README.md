<h1> LISTA DE EXERCÍCIOS – PARTES A, B e C (com testes) </h1>
PARTE A — Métodos na classe Vetor
1. Método boolean estaVazia()
Implemente um método que retorna true se o vetor está vazio (tamanho == 0).
2. Método String ultimo()
Retorna o último elemento válido. Se o vetor estiver vazio, lance IllegalStateException.
3. Método void imprimeUmPorLinha()
Imprima todos os elementos válidos do vetor, um por linha.
4. Método boolean contem(String elemento)
Retorna true se o vetor contém o elemento. Caso contrário, false.
PARTE B — Classes de teste
5. TesteVetor1
Crie um vetor, adicione 3 elementos, imprima o tamanho, o vetor e os elementos um por linha.
6. TesteVetor2
Crie um vetor com 10 posições, adicione 4 elementos, teste busca(String) e contem(String).
7. TesteVetor3
Chame ultimo() antes e depois de adicionar elementos, observando a exceção.
PARTE C — Métodos adicionais na classe Vetor
8. Método void limpar()
Zere o vetor, removendo todos os elementos.
9. Método int contarOcorrencias(String elemento)
Conte quantas vezes o elemento aparece no vetor.
10. Método boolean substituir(String antigo, String novo)
Substitua a primeira ocorrência de “antigo” por “novo”.
PARTE C — TESTES
8B. TesteVetor4 — Testar limpar()
Crie um vetor, adicione elementos, imprima antes e depois de limpar().
9B. TesteVetor5 — Testar contarOcorrencias()
Adicione elementos repetidos e imprima a contagem.
10B. TesteVetor6 — Testar substituir()
Substitua um elemento existente e tente substituir um inexistente.
OBS: Caso algum exercício ultrapasse o conteúdo visto hoje, fazer depois.
-----------------------------------------------------------------------------------------------------------------------------------------------------
<h1> LISTA DE EXERCÍCIOS — PARTES D, E e F </h1>
Estrutura de Dados — Classe Vetor
PARTE D — Remoção por posição
11. Método void remove(int posicao)
Implemente um método que remove o elemento de uma posição específica.
Regras:
1. Se a posição for inválida, lance IllegalArgumentException.
2. Desloque os elementos à direita uma posição para a esquerda.
3. Decremente tamanho.
4. Opcional: limpar a última posição usada.
11B. TesteVetor7 — Testar remove(int posicao)- Crie um vetor e adicione: A, B, C, D, E.- Remova posição 0, uma posição do meio e a última.- Imprima o vetor e o tamanho após cada remoção.- Teste uma remoção inválida e observe a exceção.
PARTE E — Remoção usando busca
12. Método boolean remove(String elemento)
Regras:
1. Use busca(elemento).
2. Se não encontrar, retorne false.
3. Se encontrar, chame remove(posicao).
4. Retorne true.
12B. TesteVetor8 — Testar remove(String elemento)- Vetor: A, B, C, B, D.
- Remova "B" → só a primeira ocorrência desaparece.- Remova "X" → false, vetor permanece igual.
PARTE F — Exercícios Extras
13. Método int indiceUltimo(String elemento)
Retorna a última ocorrência do elemento ou -1.
13B. TesteVetor9
Testar com repetidos, ex.: A, B, C, B, D, B.
14. Método void removerTodos(String elemento)
Remove todas as ocorrências. Sugestão: while(remove(elemento)){}.
14B. TesteVetor10
Testar com múltiplas ocorrências.
15. Método boolean adicionarSeNaoExiste(String elemento)
Somente adiciona se não existir no vetor.
15B. TesteVetor11
Adicionar várias vezes e confirmar que só aparece uma vez.
16. Método boolean inserirDepois(String referencia, String novoElemento)
Insere após a primeira ocorrência de referencia.
16B. TesteVetor12
Exemplo: vetor A, C, D → inserirDepois("A","B") → A, B, C, D
----------------------------------------------------------------------------------------------------------

<h1> Lista de Exercícios — Estrutura de Dados: Pilhas </h1>
Parte 1 — Implementação
1. Implementar uma pilha
Crie uma classe Pilha que utilize um vetor para armazenar os elementos.
A classe deve possuir:
• um vetor chamado elementos
• uma variável chamada tamanho
Implemente os métodos:
empilha(String elemento)
desempilha()
topo()
estaVazia()
tamanho()
2. Testando a pilha
Crie um programa que:
1. empilhe "A"
2. empilhe "B"
3. empilhe "C"
4. mostre o elemento do topo
5. desempilhe um elemento
6. mostre novamente o topo
Exemplo de saída esperada:
Topo: C
Removido: C
Topo: B
3. Mostrar elementos da pilha
Sobrescreva o método toString() da classe Pilha para exibir os elementos no formato:
[A, B, C]
Parte 2 — Exercícios de Aplicação
4. Inverter uma palavra
Utilize uma pilha para inverter a palavra:
hello
Saída esperada:
olleh
5. Verificar palíndromo
Crie um programa que verifique se uma palavra é um palíndromo utilizando pilha.
Exemplos:
arara → É palíndromo
casa → Não é palíndromo
6. Inverter a ordem das palavras
Utilize uma pilha para inverter a ordem das palavras da frase:
eu gosto de java
Saída esperada:
java de gosto eu.
--------------------------------------------------------------------------------------------------------------
Exercícios sobre Lista Encadeada 
Exercício 1 — Lista de chamada da turma 
Usando a estrutura de dados Lista Encadeada, crie um programa que simule uma lista de 
chamada. 
Cada aluno deve ter: 
● nome 
● matrícula 
O programa deve: 
● adicionar 5 alunos na lista; 
● mostrar todos os alunos cadastrados; 
● mostrar o primeiro aluno da lista; 
● mostrar o último aluno da lista; 
● informar quantos alunos existem na lista. 
Objetivo didático 
Treinar: 
● adiciona 
● toString 
● pegaPrimeiro 
● pegaUltimo 
● getTamanho 
Exercício 2 — Playlist de músicas 
Crie um programa que simule uma playlist usando Lista Encadeada. 
Cada música deve ter: 
● título 
● artista 
O programa deve: 
● adicionar 6 músicas; 
● exibir a playlist completa; 
● verificar se uma música específica está na lista; 
● mostrar quantas músicas existem ao todo. 
Objetivo didático 
Treinar: 
● adiciona 
● contem 
● getTamanho 
Exercício 3 — Lista de compras 
Usando Lista Encadeada, simule uma lista de compras. 
Cada item deve ter: 
● nome do produto 
● quantidade 
O programa deve: 
● adicionar 7 itens; 
● exibir todos os itens da lista; 
● mostrar o item que está em uma posição informada; 
● verificar se um determinado produto foi adicionado; 
● contar quantos itens foram cadastrados. 
Objetivo didático 
Treinar: 
● adiciona 
● pega(int indice) 
● contem 
● getTamanho 
Exercício 4 — Catálogo de livros 
Crie um programa que represente um catálogo de livros usando Lista Encadeada. 
Cada livro deve ter: 
● título 
● autor 
● ano de publicação 
O programa deve: 
● cadastrar 5 livros; 
● mostrar todos os livros; 
● exibir o primeiro livro cadastrado; 
● exibir o último livro cadastrado. 
Objetivo didático 
Treinar: 
● adiciona 
● pegaPrimeiro 
● pegaUltimo 
Exercício 5 — Histórico de navegação 
Usando Lista Encadeada, crie um programa que simule um histórico de navegação. 
Cada página deve ter: 
● título da página 
● endereço do site 
O programa deve: 
● adicionar 8 páginas visitadas; 
● mostrar o histórico completo; 
● informar se determinada página foi visitada; 
● mostrar a última página visitada; 
● informar a quantidade total de páginas no histórico. 
Objetivo didático 
Treinar: 
● adiciona 
● toString 
● contem 
● pegaUltimo 
● getTamanho 
Exercício 6 — Lista de convidados 
Crie um programa que simule uma lista de convidados para um evento usando Lista 
Encadeada. 
Cada convidado deve ter: 
● nome 
● CPF 
O programa deve: 
● cadastrar 6 convidados; 
● exibir a lista completa; 
● verificar se um convidado específico está cadastrado; 
● informar o número total de convidados. 
Objetivo didático 
Treinar: 
● adiciona 
● contem 
● getTamanho 
Exercício 7 — Estoque de produtos 
Usando Lista Encadeada, crie um programa que simule um cadastro de produtos em 
estoque. 
Cada produto deve ter: 
● nome 
● preço 
● quantidade em estoque 
O programa deve: 
● adicionar 5 produtos; 
● exibir todos os produtos; 
● mostrar o produto que está em uma determinada posição; 
● verificar se um produto existe no estoque; 
● mostrar o primeiro e o último produto cadastrados. 
Objetivo didático 
Treinar: 
● adiciona 
● pega(int indice) 
● contem 
● pegaPrimeiro 
● pegaUltimo 
Exercício 8 — Agenda de contatos 
Crie um programa que represente uma agenda de contatos usando Lista Encadeada. 
Cada contato deve ter: 
● nome 
● telefone 
O programa deve: 
● adicionar 6 contatos; 
● exibir todos os contatos; 
● verificar se um contato está cadastrado; 
● exibir quantos contatos existem. 
Objetivo didático 
Treinar: 
● adiciona 
● toString 
● contem 
● getTamanho 
Exercício 9 — Boletim de notas 
Usando Lista Encadeada, crie um programa que simule o cadastro de notas de um aluno. 
Cada registro deve ter: 
● nome da disciplina 
● nota final 
O programa deve: 
● adicionar 5 disciplinas; 
● exibir todas as disciplinas com suas notas; 
● mostrar qual disciplina está em uma posição específica; 
● verificar se uma disciplina está cadastrada; 
● mostrar quantos registros existem. 
Objetivo didático 
Treinar: 
● adiciona 
● pega(int indice) 
● contem 
● getTamanho 
Exercício 10 — Vagas de estacionamento 
Crie um programa usando Lista Encadeada para representar os carros estacionados. 
Cada carro deve ter: 
● placa 
● modelo 
O programa deve: 
● adicionar 5 carros; 
● exibir todos os carros estacionados; 
● verificar se um carro de placa específica está na lista; 
● exibir o primeiro e o último carro estacionados. 
Objetivo didático 
Treinar: 
● adiciona 
● contem 
● pegaPrimeiro 
● pegaUltimo
----------------------------------------------------------------------------------------------------------------------------

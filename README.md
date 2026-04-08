---

# 📘 Lista de Exercícios — Estrutura de Dados

---

## 🧩 PARTE A — Métodos na classe Vetor

1. **Método `boolean estaVazia()`**
   Retorna `true` se o vetor está vazio (`tamanho == 0`).

2. **Método `String ultimo()`**
   Retorna o último elemento válido.
   Se o vetor estiver vazio, lance `IllegalStateException`.

3. **Método `void imprimeUmPorLinha()`**
   Imprime todos os elementos válidos do vetor, um por linha.

4. **Método `boolean contem(String elemento)`**
   Retorna `true` se o vetor contém o elemento.

---

## 🧪 PARTE B — Classes de teste

5. **TesteVetor1**

   * Crie um vetor
   * Adicione 3 elementos
   * Imprima:

     * o tamanho
     * o vetor
     * os elementos (um por linha)

6. **TesteVetor2**

   * Vetor com 10 posições
   * Adicione 4 elementos
   * Teste:

     * `busca(String)`
     * `contem(String)`

7. **TesteVetor3**

   * Chame `ultimo()` antes e depois de adicionar elementos
   * Observe a exceção

---

## ⚙️ PARTE C — Métodos adicionais

8. **Método `void limpar()`**
   Remove todos os elementos do vetor.

9. **Método `int contarOcorrencias(String elemento)`**
   Conta quantas vezes o elemento aparece.

10. **Método `boolean substituir(String antigo, String novo)`**
    Substitui a primeira ocorrência.

---

## 🧪 PARTE C — Testes

8B. **TesteVetor4 — limpar()**

* Imprimir antes e depois de limpar

9B. **TesteVetor5 — contarOcorrencias()**

* Usar elementos repetidos

10B. **TesteVetor6 — substituir()**

* Testar com elemento existente e inexistente

---

## 🧩 PARTE D — Remoção por posição

11. **Método `void remove(int posicao)`**

Regras:

* Posição inválida → `IllegalArgumentException`
* Deslocar elementos à esquerda
* Decrementar tamanho
* (Opcional) limpar última posição

11B. **TesteVetor7**

* Vetor: A, B, C, D, E
* Remover:

  * início
  * meio
  * fim
* Testar erro

---

## 🔎 PARTE E — Remoção por busca

12. **Método `boolean remove(String elemento)`**

Regras:

* Usar `busca()`
* Retornar `false` se não encontrar
* Se encontrar → remover

12B. **TesteVetor8**

* Vetor: A, B, C, B, D
* Remover "B" → remove só o primeiro
* Remover "X" → retorna false

---

## 🚀 PARTE F — Extras

13. **`indiceUltimo(String elemento)`**

* Retorna última ocorrência ou `-1`

14. **`removerTodos(String elemento)`**

```java
while(remove(elemento)) {}
```

15. **`adicionarSeNaoExiste(String elemento)`**

16. **`inserirDepois(String referencia, String novoElemento)`**

Exemplo:

```
A, C, D → inserirDepois("A","B") → A, B, C, D
```

---

## 🧪 Testes Extras

* **TesteVetor9** → índice último
* **TesteVetor10** → remover todos
* **TesteVetor11** → não duplicar
* **TesteVetor12** → inserir depois

---

# 📚 Lista de Exercícios — Pilhas

## Parte 1 — Implementação

### 1. Criar classe `Pilha`

Atributos:

* `elementos`
* `tamanho`

Métodos:

* `empilha`
* `desempilha`
* `topo`
* `estaVazia`
* `tamanho`

---

### 2. Teste da pilha

Passos:

1. Empilhar "A"
2. Empilhar "B"
3. Empilhar "C"
4. Mostrar topo
5. Desempilhar
6. Mostrar topo

Saída esperada:

```
Topo: C
Removido: C
Topo: B
```

---

### 3. `toString()`

Formato:

```
[A, B, C]
```

---

## Parte 2 — Aplicações

4. **Inverter palavra**

```
hello → olleh
```

5. **Palíndromo**

* arara → sim
* casa → não

6. **Inverter frase**

```
eu gosto de java → java de gosto eu
```

---

# 🔗 Exercícios — Lista Encadeada

## Exercício 1 — Lista de chamada

* nome
* matrícula

Operações:

* adicionar 5 alunos
* listar todos
* primeiro
* último
* total

---

## Exercício 2 — Playlist

* título
* artista

---

## Exercício 3 — Lista de compras

* produto
* quantidade

---

## Exercício 4 — Catálogo de livros

* título
* autor
* ano

---

## Exercício 5 — Histórico

* página
* endereço

---

## Exercício 6 — Convidados

* nome
* CPF

---

## Exercício 7 — Estoque

* nome
* preço
* quantidade

---

## Exercício 8 — Agenda

* nome
* telefone

---

## Exercício 9 — Boletim

* disciplina
* nota

---

## Exercício 10 — Estacionamento

* placa
* modelo

---



Se quiser, posso deixar ainda mais bonito (com badges, cores, separadores ou versão pronta pra portfólio no GitHub).

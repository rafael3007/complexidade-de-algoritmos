## Complexidade ciclomática

    Enquanto Big-O é mais voltada aos custos de execução de um algoritmo( tempo de execução ) a `CC` é mais utilizada como medida de qualidade 
    Geralmente codigo com alto valor de cc são dificeis de serem lidos e compreendidos e isso acrreta em conseguências para o desenvolvimento. Esses códigos são fortes candidatos a refatoração.

### CC = A - V + 2
```javascript
    CC = valor_da_compelxidade
    A = numero_de_arestas
    V = nó

    CC <= 10 é um valor OK

```


## Grafos
    Conjunto de vertices ou nós e um conjunto de arestas ( similar a Complexidade ciclomática )

### O problema da coloração dos Grafos
    Consistem em atribuir uma cor para cada vértice de um grafo de modo que os vértices adjacentes não tenham a mesma cor
    O objetivo é atribuir o menor número de cores de forma que os vertices adjacentes não tenha a mesma cor.
    É um problema de NP-completo pois ainda não se sabe um algoritmo completo para resolve-lo

    Exemplo: alocação de horários e de recursos
```python

# Cursos podem ser representados como vértices e as restrições de horários podem ser as arestas

# A coloração pode ajudar a definir uma grade de horários sem conflitos
```
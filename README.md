
# Aula 2

    - Continuação do Algoritmo, mas agora implementando um possivel tratamento para "busca sequencial"
    - Foco nos piores casos!

#### O que é complexidade de algoritmo (parte 1)

    - Ordenação e pesquisa binária

### Comportamento Assintótico e Classes de Complexidade

#### Definição
    - Representa o limite do comportamento do custo( de um algoritmo ) quando N ( elementros de entrada de um algoritmo, por exemplo) cresce
    - A medidade de custo, ou medida de complexidade, indica o crescimento assintótico ( tempo de execição )

    # o custo deve ser reduzido para que o programa seja executado de forma eficiente

###  Crescimento assintótico

    - Análise do algoritmo de busca sequencia e binária

    - identificar as situações de piores casos

    - Generalizando: Quando falamos de comportamento ou Crescimento Assintótico ou da medição da complexidade( assintótica) de algoritmos nos preocupamos mais especificamente com os piores casos de execução de algoritmos.

### Notação Big-Θ

    - Θ -> Letra teta
    - È uma forma (matemática ) de referenciar o crescimento assintótico ou da complexidade de um algoritmo
    - é um limiar para delimitar o crescimento do tempo de execução( *numero de passos)
        -- Casos médios e melhores casos são os que executam abaixo do limiar
        -- Piores caos executam acima do limiar

### Tipos de Complexidade ou Classe de complexidade

    - Complexidade Constante: Θ = 1. Independete do tamanho de entradas( n ). As instruções do algoritmo são sempre executadas num tamanho fixo de vezes. ex: Algoritmo de indentificação se um número é par ou impart. Algoritmo de conversão de Fahrenheit para Celsius.

    - Complexidade Linear: são algoritmos cusjas complexidades correspondem ao valor de > Θ * ( n )

    - Complexidade Logaritmica: São os algoritmos cujas complexidades  correspondem ao valor de Θ(log N). Exemplos Busca binária, árvore de busca binária

    - Complexidade N Log N: São algoritmos cujas complexidades correspondem ao valor de Θ (Log N^N). Ocorre em algoritmos que dividem o problema a ser resolvido em partes menores
        - o que torna uma complexidade parecida com a Logaritima
        - Porém, posteriormente a solução junta os resultados das duas operações sobrea as partes menores. Exemplo Algortimo de ordenação merd




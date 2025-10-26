# 🎯 Exemplos Práticos de Prompts para Análise de Dados

## Guia Hands-On com Templates Prontos

---

## 📋 Como Usar Este Documento

Este guia contém **prompts prontos para uso** que você pode copiar e colar diretamente em ferramentas de IA como Claude, ChatGPT ou Gemini. Cada prompt inclui:

- ✅ **Template** - Pronto para copiar
- 🎯 **Objetivo** - O que você vai descobrir
- 💡 **Dica** - Como otimizar o resultado
- 📊 **Output Esperado** - O que esperar da resposta

---

## 🚀 Nível 1: Prompts Básicos (Iniciante)

### Prompt 1.1: Visão Geral dos Dados

```
Analise os dados de vendas fornecidos e responda:
1. Quantas transações existem no total?
2. Qual o período coberto pelos dados?
3. Quantas unidades foram vendidas?
4. Qual o valor total das vendas?
5. Quais são os produtos únicos no dataset?

Apresente em formato de lista clara e objetiva.
```

**🎯 Objetivo:** Compreender escopo e dimensão dos dados  
**💡 Dica:** Use este prompt primeiro, sempre que receber um novo dataset  
**📊 Output:** Lista com estatísticas descritivas básicas

---

### Prompt 1.2: Identificar Top Produtos

```
Liste os 5 produtos mais vendidos por:
a) Quantidade total de unidades
b) Número de transações

Para cada produto, mostre:
- Nome do produto
- Quantidade vendida
- Percentual do total
- Preço unitário

Organize em uma tabela comparativa.
```

**🎯 Objetivo:** Identificar produtos estrela  
**💡 Dica:** Ajuste o número de produtos conforme necessário (top 3, top 10)  
**📊 Output:** Tabela ranking com métricas

---

### Prompt 1.3: Análise Temporal Simples

```
Agrupe as vendas por mês e mostre:
1. Volume de vendas (unidades) por mês
2. Número de transações por mês
3. Ticket médio por mês

Identifique:
- Qual foi o melhor mês?
- Qual foi o pior mês?
- Qual a tendência geral (crescimento, estabilidade, queda)?
```

**🎯 Objetivo:** Entender padrões temporais básicos  
**💡 Dica:** Pergunte sobre possíveis causas sazonais  
**📊 Output:** Série temporal com análise

---

## 🎓 Nível 2: Prompts Intermediários

### Prompt 2.1: Análise Comparativa de Marcas

```
Compare o desempenho das marcas Anbernic e Meganium:

Métricas a comparar:
1. Volume total de vendas (unidades)
2. Número de transações
3. Ticket médio (unidades por transação)
4. Preço médio de venda
5. Desconto médio aplicado

Para cada métrica:
- Apresente os valores absolutos
- Calcule a diferença percentual
- Identifique qual marca está melhor

Finalize com 3 insights principais sobre as diferenças.
```

**🎯 Objetivo:** Benchmark competitivo  
**💡 Dica:** Adicione "Forneça hipóteses do porquê das diferenças"  
**📊 Output:** Tabela comparativa + análise qualitativa

---

### Prompt 2.2: Segmentação Geográfica

```
Analise a distribuição geográfica das vendas:

1. Liste todos os países de destino com suas respectivas:
   - Quantidade de transações
   - Volume total (unidades)
   - Percentual do total

2. Identifique:
   - Top 5 países por volume
   - Concentração (% dos top 3)
   - Países com apenas 1-2 transações

3. Sugira:
   - Mercados para investir mais
   - Mercados para explorar
   - Mercados para descontinuar

Organize em formato de relatório executivo.
```

**🎯 Objetivo:** Estratégia de expansão geográfica  
**💡 Dica:** Peça também análise por continente ou região  
**📊 Output:** Relatório com mapa de oportunidades

---

### Prompt 2.3: Análise de Canais de Venda

```
Examine a performance por canal de vendas (Shopee, Etsy, AliExpress):

Para cada canal, calcule:
1. Número e % de transações
2. Volume de unidades vendidas
3. Valor médio por transação
4. Produto mais vendido
5. País de destino principal

Compare os canais e responda:
- Qual canal tem melhor performance geral?
- Qual canal tem maior ticket médio?
- Há produtos específicos que performam melhor em certos canais?
- Quais canais estão subutilizados?

Finalize com recomendações de alocação de recursos.
```

**🎯 Objetivo:** Otimização de mix de canais  
**💡 Dica:** Adicione análise de sazonalidade por canal  
**📊 Output:** Dashboard conceitual + recomendações

---

## 🏆 Nível 3: Prompts Avançados

### Prompt 3.1: Análise de Precificação Estratégica

```
Conduza uma análise profunda de precificação:

PARTE 1 - Estrutura Atual:
- Liste todos os produtos com seus preços unitários
- Identifique gaps de preço entre produtos
- Analise se a estrutura de preços faz sentido estratégico

PARTE 2 - Descontos:
- Calcule o desconto médio, mediano, mínimo e máximo
- Calcule a taxa de desconto média (% sobre preço base)
- Identifique padrões: descontos variam por canal? Por produto?

PARTE 3 - Análise Competitiva:
- Compare os preços Anbernic vs Meganium produto a produto
- Há diferenças significativas? Quais as implicações?

PARTE 4 - Recomendações:
- A estratégia de descontos está otimizada?
- Há oportunidade de aumentar preços em alguns produtos?
- Devemos reduzir descontos em algum segmento?

Apresente como um relatório de pricing strategy.
```

**🎯 Objetivo:** Otimização de margem e percepção de valor  
**💡 Dica:** Peça análise de elasticidade se houver dados históricos  
**📊 Output:** Relatório completo de pricing

---

### Prompt 3.2: Segmentação de Clientes

```
Analise o perfil dos compradores usando data de nascimento:

1. Calcule a idade de cada comprador (use data do pedido - data nascimento)
2. Segmente em faixas etárias:
   - Gen Z (18-27 anos)
   - Millennials (28-43 anos)
   - Gen X (44-59 anos)
   - Baby Boomers (60+ anos)

Para cada segmento, analise:
- Número de compradores
- Produtos preferidos
- Ticket médio
- Canais de compra preferidos
- Países principais

Insights:
- Qual geração compra mais?
- Há diferenças significativas de comportamento?
- Como adaptar estratégia para cada segmento?

Crie personas para os 2 segmentos principais.
```

**🎯 Objetivo:** Personalização de marketing  
**💡 Dica:** Combine com análise geográfica para dupla segmentação  
**📊 Output:** Perfis de personas + estratégias

---

### Prompt 3.3: Análise Preditiva e Projeções

```
Com base nos dados históricos de maio a novembro:

ANÁLISE RETROSPECTIVA:
1. Calcule o crescimento mês a mês (MoM)
2. Identifique tendências e padrões sazonais
3. Calcule médias móveis (3 meses)

PROJEÇÕES:
1. Projete vendas para dezembro usando:
   - Média dos últimos 3 meses
   - Tendência linear
   - Ajuste sazonal (dezembro é forte?)

2. Estime vendas Q1 2025 considerando:
   - Padrões históricos
   - Sazonalidade típica de eletrônicos
   - Crescimento orgânico esperado

CENÁRIOS:
- Cenário conservador (crescimento mínimo)
- Cenário realista (tendência atual)
- Cenário otimista (aceleração)

Para cada cenário, sugira:
- Necessidades de estoque
- Investimento em marketing
- Metas de vendas por canal

Apresente como um plano de negócios.
```

**🎯 Objetivo:** Planejamento estratégico  
**💡 Dica:** Validar premissas com dados externos do setor  
**📊 Output:** Forecast com cenários múltiplos

---

## 🔥 Nível 4: Prompts Expert

### Prompt 4.1: Análise de Coorte Completa

```
Realize uma análise de coorte sofisticada:

DEFINIÇÃO DE COORTES:
Agrupe clientes por mês da primeira compra (coorte de aquisição)

PARA CADA COORTE:
1. Tamanho da coorte (número de clientes únicos)
2. Valor total gasto no mês de aquisição
3. Taxa de recompra nos meses seguintes
4. Valor vitalício (LTV) acumulado

ANÁLISE:
- Qual coorte tem melhor retenção?
- Qual coorte tem maior LTV?
- O valor da primeira compra prediz recompra?
- Como a retenção evolui ao longo do tempo?

INSIGHTS ESTRATÉGICOS:
- Qual perfil de cliente traz mais valor no longo prazo?
- Como melhorar a retenção das coortes mais fracas?
- Qual o payback period do CAC?

Visualize como uma matriz de coorte.
```

**🎯 Objetivo:** Entender valor vitalício e retenção  
**💡 Dica:** Combine com análise de produtos comprados  
**📊 Output:** Matriz de coorte + análise de LTV

---

### Prompt 4.2: Análise de Cesta de Produtos

```
Analise padrões de compra múltipla:

IDENTIFICAÇÃO:
1. Liste todas as transações com quantity > 1
2. Identifique se há compras de produtos diferentes na mesma transação
   (usando invoice_id como chave)

PADRÕES:
- Quais produtos são frequentemente comprados juntos?
- Qual a quantidade típica quando há compra múltipla?
- Há diferença entre marcas?

ANÁLISE DE OPORTUNIDADE:
- Criar bundles faz sentido? Quais combinações?
- Estratégia de "compre 2, leve 3" seria efetiva?
- Cross-sell: ao comprar X, sugerir Y

PRECIFICAÇÃO DE BUNDLES:
- Sugira 3 bundles rentáveis
- Calcule preço bundle vs soma individual
- Estime demanda potencial

Apresente como estratégia de merchandising.
```

**🎯 Objetivo:** Aumentar ticket médio  
**💡 Dica:** Use análise de associação (market basket)  
**📊 Output:** Recomendações de bundles

---

### Prompt 4.3: Dashboard Executivo Completo

```
Crie um dashboard executivo consolidado com:

SEÇÃO 1: KPIs PRINCIPAIS (Card format)
- Revenue Total (última conversão para USD)
- Unidades Vendidas
- Número de Transações
- Ticket Médio
- AOV (Average Order Value)
- Desconto Médio

SEÇÃO 2: TENDÊNCIAS (Gráficos conceituais)
- Vendas por mês (linha)
- Top 5 produtos (barra)
- Distribuição geográfica (mapa conceitual)
- Mix de canais (pizza)

SEÇÃO 3: COMPARAÇÕES
- Anbernic vs Meganium (lado a lado)
- Mês atual vs mês anterior (MoM)
- Período atual vs mesmo período ano anterior (YoY - se houver)

SEÇÃO 4: ALERTAS E INSIGHTS
- 3 oportunidades principais
- 3 riscos identificados
- 3 ações recomendadas

SEÇÃO 5: METAS
- Performance vs meta (se houver benchmark)
- Projeção para próximo mês
- Gap analysis

Formato: Relatório executivo de 1 página.
```

**🎯 Objetivo:** Visão holística para tomadores de decisão  
**💡 Dica:** Atualize mensalmente e compare evolutivamente  
**📊 Output:** Dashboard executivo completo

---

## 🎨 Templates de Prompt por Objetivo

### 🔍 Para EXPLORAR dados novos:
```
Analise este dataset e forneça:
1. Estrutura (colunas e tipos)
2. Estatísticas descritivas básicas
3. Qualidade dos dados (nulos, duplicatas)
4. 5 primeiros insights interessantes
```

### 📊 Para COMPARAR opções:
```
Compare [A] vs [B] considerando:
- Métrica 1
- Métrica 2
- Métrica 3

Para cada métrica, mostre:
- Valores absolutos
- Diferença percentual
- Qual é melhor e por quê

Recomendação final: [A] ou [B]?
```

### 🎯 Para IDENTIFICAR oportunidades:
```
Analise os dados buscando oportunidades de:
1. Crescimento de receita
2. Redução de custos
3. Expansão de mercado
4. Otimização operacional

Para cada oportunidade identificada:
- Descrição clara
- Potencial de impacto (alto/médio/baixo)
- Esforço necessário
- Quick wins vs longo prazo
```

### 💡 Para GERAR insights:
```
Analise [aspecto específico] e responda:
- O que os dados mostram?
- Por que isso é importante?
- E daí? (So what?)
- O que fazer a respeito?

Foco em insights ACIONÁVEIS, não apenas descritivos.
```

### 🚀 Para RECOMENDAR ações:
```
Com base nos dados, recomende:
1. 3 ações de curto prazo (0-3 meses)
2. 3 ações de médio prazo (3-12 meses)
3. 1 ação estratégica de longo prazo

Para cada ação:
- Descrição específica
- Resultado esperado
- Recursos necessários
- Métricas de sucesso
```

---

## ✨ Dicas de Ouro para Prompts Eficazes

### ✅ SEMPRE FAÇA:
1. Seja específico sobre o que quer
2. Defina o formato de saída desejado
3. Peça interpretações, não apenas números
4. Solicite recomendações acionáveis
5. Use listas numeradas para múltiplas questões

### ❌ EVITE:
1. Perguntas vagas ou abertas demais
2. Múltiplos objetivos conflitantes no mesmo prompt
3. Assumir que a IA sabe o contexto do seu negócio
4. Pedir apenas dados sem interpretação
5. Prompts muito longos (divida em partes)

### 🎯 ESTRUTURA IDEAL:
```
[CONTEXTO]
Breve descrição do que você tem

[OBJETIVO]
O que você quer descobrir

[FORMATO]
Como quer a resposta

[PERGUNTAS ESPECÍFICAS]
Lista clara de questões

[ENTREGÁVEL]
Tipo de output esperado
```

---

## 🔄 Workflow Recomendado

```
1. EXPLORAÇÃO
   └─> Prompt 1.1 (Visão Geral)
   
2. ANÁLISE DESCRITIVA
   ├─> Prompt 1.2 (Top Produtos)
   └─> Prompt 1.3 (Temporal)
   
3. ANÁLISE COMPARATIVA
   ├─> Prompt 2.1 (Marcas)
   └─> Prompt 2.3 (Canais)
   
4. SEGMENTAÇÃO
   ├─> Prompt 2.2 (Geografia)
   └─> Prompt 3.2 (Clientes)
   
5. ESTRATÉGIA
   ├─> Prompt 3.1 (Pricing)
   ├─> Prompt 3.3 (Forecast)
   └─> Prompt 4.3 (Dashboard)
   
6. APROFUNDAMENTO
   ├─> Prompt 4.1 (Coorte)
   └─> Prompt 4.2 (Cesta)
```

---

## 📚 Recursos Adicionais

- **Biblioteca de Prompts:** [PromptBase](https://promptbase.com/)
- **Comunidade:** [r/PromptEngineering](https://reddit.com/r/PromptEngineering)
- **Tutoriais:** [Learn Prompting](https://learnprompting.org/)

---

*Guia criado para o Bootcamp DIO | Use, adapte e compartilhe! 🚀*
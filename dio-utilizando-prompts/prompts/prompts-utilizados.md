# 📋 Documentação de Prompts para Análise de Vendas

## Projeto: Análise de Dados com IA - DIO

---

## 🎯 Objetivo do Documento

Este documento registra todos os prompts utilizados na análise dos dados de vendas, demonstrando como estruturar perguntas eficazes para extrair insights valiosos de dados comerciais usando ferramentas de IA.

---

## 🔍 Prompts Utilizados na Análise

### 1. Prompt de Exploração Inicial

**Objetivo:** Compreender a estrutura e escopo dos dados

```
Analise os arquivos CSV fornecidos e me dê uma visão geral:
- Quais são as principais colunas em cada arquivo?
- Qual o período coberto pelos dados?
- Quantas transações existem em cada dataset?
- Quais são as diferenças estruturais entre os arquivos Anbernic e Meganium?
```

**Por que este prompt funciona:**
- Questões específicas e estruturadas
- Foca em aspectos técnicos fundamentais
- Permite validação da qualidade dos dados

---

### 2. Prompt de Análise Comparativa

**Objetivo:** Comparar performance entre marcas

```
Compare o desempenho de vendas entre Anbernic e Meganium considerando:
1. Volume total de vendas (quantidade de unidades)
2. Número de transações
3. Ticket médio por transação
4. Distribuição de vendas por produto

Organize os resultados em formato comparativo claro.
```

**Por que este prompt funciona:**
- Define métricas específicas para comparação
- Solicita formato organizado de resposta
- Permite identificação clara de padrões

---

### 3. Prompt de Análise de Produto

**Objetivo:** Identificar produtos mais performáticos

```
Para cada marca (Anbernic e Meganium), identifique:
- Os 3 produtos mais vendidos por volume
- A participação percentual de cada produto no total
- O preço unitário de cada modelo
- Padrões de preferência dos consumidores

Apresente os resultados com ranking claro.
```

**Por que este prompt funciona:**
- Estrutura hierárquica clara (top 3)
- Solicita contexto percentual
- Inclui análise de precificação
- Pede interpretação de padrões

---

### 4. Prompt de Análise Geográfica

**Objetivo:** Mapear distribuição geográfica das vendas

```
Analise a distribuição geográfica das vendas:
1. Liste os top 5 países de destino por volume
2. Calcule a concentração de vendas (% nos top 3 países)
3. Identifique mercados emergentes com potencial
4. Compare a distribuição geográfica entre Anbernic e Meganium

Sugira oportunidades de expansão baseadas nos dados.
```

**Por que este prompt funciona:**
- Combina análise quantitativa e qualitativa
- Solicita recomendações estratégicas
- Inclui análise comparativa
- Foca em acionabilidade

---

### 5. Prompt de Análise de Canais

**Objetivo:** Avaliar performance por plataforma de venda

```
Examine a distribuição de vendas por canal (Shopee, Etsy, AliExpress):
- Número e percentual de transações por canal para cada marca
- Volume de vendas por canal
- Identifique dependências excessivas de canais específicos
- Avalie o equilíbrio de portfolio de canais

Forneça recomendações de diversificação se aplicável.
```

**Por que este prompt funciona:**
- Análise multidimensional (transações + volume)
- Identifica riscos (dependência)
- Solicita avaliação qualitativa
- Pede recomendações práticas

---

### 6. Prompt de Análise Temporal

**Objetivo:** Identificar sazonalidade e tendências

```
Analise os padrões temporais de maio a novembro de 2024:
1. Identifique os meses com maior volume de vendas
2. Detecte padrões sazonais ou tendências
3. Compare a performance mês a mês
4. Relacione os picos com possíveis eventos (férias, Black Friday)

Sugira períodos ideais para campanhas de marketing.
```

**Por que este prompt funciona:**
- Foca em padrões temporais
- Contextualiza com eventos do mercado
- Gera insights acionáveis para marketing
- Combina análise descritiva e preditiva

---

### 7. Prompt de Análise de Precificação

**Objetivo:** Avaliar estratégia de preços e descontos

```
Examine a estratégia de precificação:
1. Liste os preços unitários por modelo de produto
2. Calcule o desconto médio aplicado por transação
3. Identifique a taxa de desconto média em percentual
4. Avalie a estrutura de portfolio de preços (segmentação)

Analise se a estratégia de descontos está otimizada.
```

**Por que este prompt funciona:**
- Análise estruturada de pricing
- Métricas financeiras específicas
- Avaliação crítica da estratégia
- Foca em otimização

---

### 8. Prompt de Síntese Estratégica

**Objetivo:** Gerar recomendações consolidadas

```
Com base em todas as análises realizadas, forneça:
1. Top 5 insights mais importantes para a gestão
2. Recomendações estratégicas específicas para:
   - Gestão de produto
   - Marketing
   - Operações
   - Expansão de mercado
3. Métricas KPI que devem ser acompanhadas
4. Riscos identificados e como mitigá-los

Priorize ações com maior potencial de impacto.
```

**Por que este prompt funciona:**
- Consolida todas as análises anteriores
- Foca em acionabilidade
- Prioriza por impacto
- Estrutura por área funcional
- Identifica riscos proativamente

---

## 💡 Melhores Práticas de Prompting para Análise de Dados

### ✅ O que FAZER:

1. **Ser Específico**
   - Defina exatamente quais métricas você quer
   - Especifique o formato desejado da resposta

2. **Estruturar as Perguntas**
   - Use listas numeradas para múltiplas questões
   - Organize hierarquicamente (do geral ao específico)

3. **Solicitar Contexto**
   - Peça interpretações, não apenas números
   - Solicite comparações e benchmarks

4. **Pedir Acionabilidade**
   - Sempre solicite recomendações práticas
   - Pergunte "e então? o que fazer com isso?"

5. **Iterar e Refinar**
   - Faça follow-ups baseados nas respostas
   - Aprofunde em áreas interessantes

### ❌ O que EVITAR:

1. **Perguntas Vagas**
   - ❌ "Me fale sobre as vendas"
   - ✅ "Qual foi o volume total de vendas por mês?"

2. **Múltiplos Objetivos Conflitantes**
   - ❌ "Analise tudo sobre produtos, canais, geografia e tempo"
   - ✅ Divida em prompts separados e focados

3. **Falta de Contexto**
   - ❌ "Este número é bom?"
   - ✅ "Este crescimento de 15% está acima ou abaixo da média do setor?"

4. **Perguntas Binárias Simples**
   - ❌ "As vendas estão boas?"
   - ✅ "Quais métricas indicam performance positiva e quais áreas precisam melhorar?"

---

## 🔄 Fluxo de Análise Recomendado

```
1. EXPLORAÇÃO
   ↓
2. ANÁLISE DESCRITIVA
   ↓
3. ANÁLISE COMPARATIVA
   ↓
4. IDENTIFICAÇÃO DE PADRÕES
   ↓
5. SÍNTESE E INSIGHTS
   ↓
6. RECOMENDAÇÕES ESTRATÉGICAS
```

---

## 📊 Template de Prompt Universal para Análise de Dados

```
Contexto: [Descreva o dataset e objetivo]

Análise Solicitada:
1. [Métrica/dimensão específica 1]
2. [Métrica/dimensão específica 2]
3. [Métrica/dimensão específica 3]

Formato Desejado:
- [Tipo de visualização/organização]

Perguntas Específicas:
- [Questão 1]
- [Questão 2]

Entregáveis:
- [ ] Análise quantitativa
- [ ] Interpretação qualitativa
- [ ] Recomendações acionáveis
- [ ] Identificação de riscos/oportunidades
```

---

## 🎓 Aprendizados do Projeto

### Insights sobre Engenharia de Prompts:

1. **Granularidade Importa**
   - Prompts muito amplos geram respostas superficiais
   - Prompts específicos geram insights profundos

2. **Contexto é Rei**
   - Fornecer contexto de negócio melhora a qualidade
   - Relacionar dados com objetivos estratégicos é essencial

3. **Iteração Gera Valor**
   - A primeira resposta raramente é a melhor
   - Follow-ups aprofundam a análise

4. **Formato Estruturado Facilita**
   - Solicitar formatos específicos (tabelas, rankings, listas)
   - Torna os insights mais utilizáveis

---

## 🚀 Próximos Passos

Para expandir esta análise, considere prompts sobre:

- **Análise de Coorte:** Comportamento de clientes ao longo do tempo
- **Análise de Churn:** Taxa de retenção de clientes
- **Análise Preditiva:** Projeções de vendas futuras
- **Análise de Margem:** Rentabilidade por produto/canal
- **Análise de Inventário:** Otimização de estoque

---

## 📚 Recursos Adicionais

- [OpenAI Prompt Engineering Guide](https://platform.openai.com/docs/guides/prompt-engineering)
- [Anthropic Prompt Library](https://docs.anthropic.com/claude/prompt-library)
- [Prompt Engineering for Data Analysis](https://www.promptingguide.ai/)

---

*Documentação criada como parte do desafio DIO - Explorando Prompts com IA*
*Autor: [Seu Nome] | Data: Outubro 2025*
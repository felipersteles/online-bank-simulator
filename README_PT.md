# Simulador de Banco Online

Este é um aplicativo baseado no desafio de

## Sobre
O Aplicativo de Pagamento Simplificado é uma plataforma de pagamento simplificada onde os usuários podem depositar e transferir dinheiro entre contas. Existem dois tipos de usuários:

- Usuários Comuns
- Comerciantes

Ambos possuem carteiras digitais com saldo e podem enviar/receber pagamentos.

## Requisitos: As Regras do Jogo
Neste Reino de Pagamento Simplificado, onde moedas dançam entre mãos digitais, estas leis sagradas devem ser respeitadas:

### Criação de Usuário

Tanto Pessoas Comuns quanto Comerciantes devem se cadastrar com:
- Nome Completo
- CPF/CNPJ (um identificador nacional único)
- E-mail (também único, como um sigilo pessoal)
- Senha (sua chave secreta)

> Não é permitida a entrada de duplicatas — duas pessoas com o mesmo CPF ou e-mail não podem entrar.

### O Fluxo do Ouro
- Usuários Comuns podem enviar moedas para Comerciantes ou outros Usuários.
- Comerciantes podem apenas receber — nunca enviar. (Pois deles é o reino do comércio, não dos gastos.)
- Verificação de Saldo: Antes de qualquer transferência, o sistema deve sussurrar: "Você tem ouro suficiente?"

### Os Rituais Sagrados

1. Autorização Externa: Antes de uma transferência ser selada, o sistema deve buscar a aprovação do Grande Oráculo (um serviço fictício: https://util.devi.tools/api/v2/authorize).
1. Segurança da Transação: Se as estrelas se desalinharem, o ouro deve retornar à bolsa do remetente. Sem meias medidas — tudo ou nada.
2. O Chamado do Mensageiro: Ao receber moedas, uma notificação (e-mail, SMS) deve ser enviada através do Correio Errante (outro serviço fictício: https://util.devi.tools/api/v1/notify).

> Não tema se o correio falhar — algumas mensagens se perdem no vento.

### O Decreto do Arquiteto

1. Este sistema deve ser RESTful, falando na língua do HTTP.
2. Faça o seu melhor, mas não se preocupe se algumas pedras permanecerem sem serem colocadas. Na Grande Entrevista, falaremos tanto de triunfos quanto de provações.

> Que seu código flua como rios e suas transações estejam sempre seguras. 💸✨
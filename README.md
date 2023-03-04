# 🛠️ Para rodar o projeto

* Configurar o `application.properties`

  Configurar o banco de dados ;
  
  spring.datasource.url => URL do seu DB
  
  spring.datasource.username => User do seu DB 
  
  spring.datasource.password => Senha do seu DB
  
  spring.jpa.hibernate.ddl-auto => Create para criar, Update em produção

  spring.mail.username => "Não responda"@gmail.com
  
  spring.mail.password => No caso do gmail, use o link a seguir https://support.google.com/accounts/answer/185833
  
* Rotas disponíveis em https://documenter.getpostman.com/view/21091597/2s8Z6vaaoC

### Configuração smtp hostgator ###

  * https://www.youtube.com/watch?v=vHO42LUnCAE&t=94s&ab_channel=Host2b

    spring.mail.host = "mail.company.com.br"
  
    spring.mail.port = 587
  
    spring.mail.username = aoresponda@company.com
  
    spring.mail.password = "email pass"
  
    spring.mail.properties.mail.smtp.auth = true
  
    spring.mail.properties.mail.smtp.starttls.enable = true
  

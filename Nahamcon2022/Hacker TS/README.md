## Hacker TS
> We all love our hacker t-shirts. Make your own custom ones.

App have html to png file and admin panel (with local access only)
Application use `wkhtmltoimage` is vulnerable to command injection (JS code) 
The library config seem not wait for XHR state change. So i send it to collborator server to get response from admin panel (localhost:5000) that contain flag

Exploit code: [exploit.html](exploit.html?raw=true)
Flag: `flag{461e2452088eb397b6138a5934af6231}`
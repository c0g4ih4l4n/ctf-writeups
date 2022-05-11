## Secure Vault
> Clam saw all those cool celebrities posting everything they do on twitter, so he decided to give it a go himself. Turns out, that's a horrible idea. After recovering from his emotional trauma, he wrote a secure vault to store his deepest secrets. Legend has it that there's even a flag in there. Can you get it?

Problem have use after free problem (no invalidate jwt after delete account). 
Register new account, login, delete account, and request to /vault to get flag
Flag: `actf{is_this_what_uaf_is}`
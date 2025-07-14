# Online Bank Simulator

This is a applciation based on a challange of a 

## About
Simplified Payment App is a streamlined payment platform where users can deposit and transfer money between accounts. There are two types of users:

- Regular Users
- Merchants

Both have digital wallets with balances and can send/receive payments.

## Requirements: The Rules of the Game
In this Simplified Payment Realm, where coins dance between digital hands, these sacred laws must be upheld:

### User Creation

Both Common Folk and Merchants must register with:
- Full Name
- CPF/CNPJ (a unique national identifier)
- Email (also unique, like a personal sigil)
- Password (their secret key)

> No duplicates shall pass—no two souls with the same CPF or email may enter.

### The Flow of Gold
- Common Users may send coins to Merchants or other Users.
- Merchants may only receive—never send. (For theirs is the kingdom of commerce, not spending.)
- Balance Check: Before any transfer, the system must whisper: "Do you have enough gold?"

### The Sacred Rituals

1. External Authorization: Before a transfer is sealed, the system must seek approval from the Great Oracle (a mock service: https://util.devi.tools/api/v2/authorize).
1. Transaction Safety: If the stars misalign, the gold must return to the sender’s purse. No half-measures—all or nothing.
2. The Messenger’s Call: Upon receiving coins, a notification (email, SMS) must be sent via the Wandering Courier (another mock: https://util.devi.tools/api/v1/notify).

> Fear not if the courier falters—some messages are lost to the winds.

## The Architect’s Decree

1. This system shall be RESTful, speaking in the tongue of HTTP.
2. Do thy best, but fret not if some stones remain unplaced. In the Grand Interview, we shall speak of triumphs and trials alike.

> May your code flow like rivers, and your transactions be ever secure. 💸✨

### Clean Arch

<img src="/images/clean_arch.png"/>

### Tools

1. [Java 21](https://www.java.com)
2. [Spring Boot 3.5.3](https://spring.io/projects/spring-boot)
3. [Insomnia](https://insomnia.rest/download)
4. [Postgres](https://www.postgresql.org)
5. [VS Code](https://code.visualstudio.com)
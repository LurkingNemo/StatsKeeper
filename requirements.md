# Requirements Document

Date: 12/11/2023

Version 1.0

| Version number | Change |
| - | - |
| 1.0 | Added character creation |

## Contents

- [Informal description](#informal-description)
- [Interfaces](#interfaces)
- [Functional and non functional requirements](#functional-and-non-functional-requirements)
	+ [Functional Requirements](#functional-requirements)
	+ [Non Functional Requirements](#non-functional-requirements)

## Informal Description

App to simplify character management for TTRPG campaigns. In its first instance it will help player create, access and modify their character sheets. 

StatsKeeper will comunicate with a server in order to store any changes once the GM approves them.

Character sheets will include informations on class, race, background, backstory, stats, skills, spells, etc. of the PG, togheter with any notes the player wants to add.

## Interfaces

| Actor | Logical Interface | Physical Interface |
| - |:-:| -:|
| Player | GUI | Keyboard + Mouse |
| GM | GUI | Keyboard + Mouse |

## Functional and non functional requirements

### Functional Requirements

| ID | Description |
| - | - |
| FR1 | Manage PGs |
| FR1.1 | Create new PG sheet |
| FR1.2 | Read sheet |
| FR1.3 | Update sheet |
| FR1.4 | Search PG |
| FR1.5 | Save PG in favorites |
| FR1.6 | Delete PG |
|||
| FR2 | Manage account |
| FR2.1 | Create new account |
| FR2.2 | Show campaings |
| FR2.3 | Show PGs |
| FR2.4 | Show favorites |
| FR2.5 | Delete account |
|||
| FR3 | Manage campaigns |
| FR3.1 | Create new campaign |
| FR3.2 | Show GM |
| FR3.3 | Show PGs |
| FR3.4 | Show notes |
| FR3.5 | Determine session date |
| FR3.6 | Start session |
| FR3.7 | End session |
| FR3.5 | Delete campaign |

### Non Functional Requirements

| ID | Type | Description | Refers to |
| - |:-:|:-:| -:|
| NFR1 | Usability | Players and GM should be able to use the app without training | All FRs |
| NFR2 | Performance | All functions should take less than 0.5s | All FRs |
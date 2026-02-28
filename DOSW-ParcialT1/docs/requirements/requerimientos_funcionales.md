# Especificación de Requerimientos Funcionales - EventSync

## RF-01: Creación de Eventos

| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** | Creación de eventos según tipo |
| **Descripción** | El sistema debe permitir crear eventos según su tipo (Conferencia, Taller, Hackathon) aplicando las reglas específicas de cada uno mediante el patrón Factory Method. |
| **Precondiciones** | - El correo del usuario debe cumplir con el formato requerido |
| **Actor** | Profesor|
| **Flujo principal** | 1. El usuario selecciona el tipo de evento a crear<br>2. El sistema valida que el usuario tenga permisos para crear ese tipo de evento<br>3. El usuario ingresa los datos requeridos (título, fecha/hora inicio, duración, cupo máximo)<br>4. El sistema valida las reglas específicas del tipo de evento (duración máxima/mínima)<br>5. El sistema crea el evento con estado PENDIENTE<br>6. El sistema confirma la creación del evento |

| **Poscondiciones** | - El evento queda registrado en el sistema con estado PENDIENTE<br>- El evento está disponible para inscripciones |




## RF-03: Notificación Automática de Cambios

| Campo | Descripción |
|------|-------------|
| **ID** | RF-03 |
| **Nombre del requerimiento** | Notificación automática de cambios |
| **Descripción** | El sistema debe notificar automáticamente a todos los inscritos cuando un evento cambie de estado, sea cancelado, modifique su fecha/hora o alcance el cupo máximo. |
| **Precondiciones** | - Debe existir un evento registrado en el sistema y debe haber almenos una persona inscrita|
| **Actor** | Sistema EventSync |
| **Flujo principal** | 1. El sistema se da cuenta de un cambio en el evento<br>2. El sistema mira todos los usuarios inscritos al evento<br>3. El sistema genera el mensaje de notificación según el tipo de cambio<br>4. El sistema envía la notificación a cada inscrito<br>5. El sistema registra las notificaciones enviadas |

| **Poscondiciones** | - Todos los inscritos reciben la notificación del cambio<br>
|



# DOSW_ParcialT1_RafaelMoreno

## Diagrama de Contexto
<img width="393" height="638" alt="image" src="https://github.com/user-attachments/assets/f5c5596a-735e-443a-a025-0edf4063b656" />


### Actores
- **Sistema RRHH**: Provee datos de profesores
- **Sistema Académico**: Provee datos de estudiantes
- **Usuarios**: Crean eventos, se inscriben y reciben notificaciones

## Patrones de Diseño

### 1. Factory Method
**Tipo**: Creacional

**Justificación**: Nos están pidiendo crear diferentes tipos de eventos (Conferencia, Taller, Hackathon) los cuales tienen reglas y validaciones que son diferentes para cada uno. El patrón Factory Method nos va a permitir encapsular la lógica de creación y garantizar que cada tipo de evento cumpla las condiciones que se necesiten (duración, quién puede crearlo, requisitos de inscripción).

### 2. Observer
**Tipo**: Comportamiento

**Justificación**: El sistema debe notificar automáticamente a todos los inscritos cuando ocurren cambios relevantes en un evento (cambio de estado, cancelación, modificación de fecha, cupo lleno). El patron Observer va a permitir que los inscritos se suscriban a un evento y reciban notificaciones automáticas sin que exista una conexion directa entre el evento y los mecanismos de notificación.

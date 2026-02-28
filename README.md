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

## Requerimientos del Sistema

### Requerimientos Funcionales

**RF1**: El sistema debe dejar crear eventos según su tipo (Conferencia, Taller, Hackathon) aplicando las reglas específicas de cada uno y en este requerimiento se puede usar el patrón Factory Method.

**RF2**: El sistema debe dejar inscribir a  los usuarios a eventos, pero tambien debe validar el cupo máximo y los requisitos específicos que tenga cada tipo de evento.

**RF3**: El sistema debe notificar automáticamente a todos los inscritos cuando un evento cambie de estado, acá se puede usar el patrón Observer.

### Requerimientos No Funcionales

**RNF1**: El sistema debe validar que los correos de profesores terminen en @escuelaing.edu.co y los de estudiantes en @mail.escuelaing.edu.co.

**RNF2**: El sistema no va a almacenar información de usuarios, sino que la va a consumir desde sistemas externos (RRHH y Académico).

## Diagramas Casos de Uso

### RF1: Crear Eventos

<img width="451" height="391" alt="image" src="https://github.com/user-attachments/assets/e20a2d4d-fc64-4fa2-9842-6e91a5c2b1a2" />


**Historia de Usuario**:
> Como profesor, quiero crear una conferencia sobre ciclos para que los estudiantes puedan inscribirse y asistir al evento.

### RF3: Notificación de Cambios

<img width="415" height="381" alt="image" src="https://github.com/user-attachments/assets/7109053a-e7e7-4c1b-bea7-b4907303b578" />

**Historia de Usuario**:
> Como estudiante inscrito en un taller, quiero recibir una notificación automática cuando el evento cambie de fecha para poder ajustar mi agenda.

## Descomposición de Tareas

### Épica: Gestión de Eventos Académicos

**Historia de Usuario**: Como profesor, quiero crear una conferencia sobre ciclos para que los estudiantes puedan inscribirse y asistir al evento.


**Tareas**:

1. **Implementar metodo para creación de eventos**

2. **Desarrollar validación de permisos de usuario**

3. **Crear clases para los eventos**


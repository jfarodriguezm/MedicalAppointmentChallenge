#language: es
#Autor: Jhonatan Fabian Rodriguez Mahecha

@historias
Característica: Gestionar Cita Médica
  Como paciente quiero realizar la solicitud de una cita médica a través del sistema de Administración de Hospitales

  Antecedentes:
    Dado que Carlos necesita utilizar el sistema de administracion de hospitales

  @escenario1
  Esquema del escenario:  Realizar el Registro de un Doctor
    Cuando el realiza el registro de un doctor en el aplicativo de Administracion de Hospitales
      | strDoctorName   | strDoctorLastName   | strDoctorTelephone   | strDoctorIdType   | strDoctorId   |
      | <strDoctorName> | <strDoctorLastName> | <strDoctorTelephone> | <strDoctorIdType> | <strDoctorId> |
    Entonces el verifica que se presente en pantalla el mensaje <strMessage>

    Ejemplos:
      | strDoctorName | strDoctorLastName | strDoctorTelephone | strDoctorIdType      | strDoctorId | strMessage                     |
      | Jhonatan      | Rodriguez         | 3101234567         | Cédula de ciudadanía | 1234561234  | Datos guardados correctamente. |


  @escenario2
  Esquema del escenario: Realizar el Registro de un Paciente
    Cuando el realiza el registro de un paciente en el aplicativo de Administracion de Hospitales
      | strPatientName   | strPatientLastName   | strPatientTelephone   | strPatientIdType   | strPatientId   | strPatientPrepaid   |
      | <strPatientName> | <strPatientLastName> | <strPatientTelephone> | <strPatientIdType> | <strPatientId> | <strPatientPrepaid> |
    Entonces el verifica que se presente en pantalla el mensaje <strMessage>

    Ejemplos:
      | strPatientName | strPatientLastName | strPatientTelephone | strPatientIdType     | strPatientId | strPatientPrepaid | strMessage                     |
      | Fabian         | Mahecha            | 3101234589          | Cédula de ciudadanía | 1234543212   | Si                | Datos guardados correctamente. |

  @escenario3
  Esquema del escenario: Realizar el Agendamiento de una Cita
    Cuando el realiza el agendamiento de una Cita
      | strAppointmentDate   | strPatientId   | strDoctorId   | strObservations   |
      | <strAppointmentDate> | <strPatientId> | <strDoctorId> | <strObservations> |
    Entonces el verifica que se presente en pantalla el mensaje <strMessage>

    Ejemplos:
      | strAppointmentDate | strPatientId | strDoctorId | strObservations | strMessage                     |
      | 05/22/2022         | 1234543212   | 1234561234  | Ninguna         | Datos guardados correctamente. |






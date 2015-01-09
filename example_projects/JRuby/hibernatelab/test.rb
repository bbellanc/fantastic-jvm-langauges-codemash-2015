require 'java'
require 'faker'
$CLASSPATH << 'target/hibernatelab-0.0.1-SNAPSHOT-jar-with-dependencies.jar'
java_import 'org.springframework.context.support.ClassPathXmlApplicationContext'

def initialize_employee_bean
  context = ClassPathXmlApplicationContext.new("application-context.xml")
  @@employee_dao = context.getBean("employerDao")
end

def create_employee
  employee = com.manifest.hibernatelab.model.Employer.new
  employee.name = Faker::Name.name
  employee.title = Faker::Name.title
  @@employee_dao.save(employee)
  employee
end


initialize_employee_bean
employee = create_employee

puts employee.inspect

puts employee.name
puts employee.title
puts employee.id
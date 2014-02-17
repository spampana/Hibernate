package org.hibernate.tutorial.examples;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.util.HibernateUtil;

/*When Bulk fetching with Hibernate are required use the StatelessSession */
public class StatelessSessionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StatelessSession session =  HibernateUtil.getSessionfactory().openStatelessSession();
		try{
		
			Transaction tx = session.beginTransaction();
		/*	ScrollMode.FORWARD_ONLY: cursor may move only forward
			ScrollMode.SCROLL_INSENSITIVE: scrollable but generally not sensitive to changes made by others
			ScrollMode.SCROLL_SENSITIVE: scrollable and generally sensitive to changes made by others
		*/
			ScrollableResults employees = session.createQuery("from Employee").scroll(ScrollMode.FORWARD_ONLY);
			while (employees.next()) {
		    Employee emp=(Employee)employees.get(0);
		    System.out.println(emp.getEmpname());
		    emp.setEmpname("satya");
		    session.update(emp);
			}
			tx.commit();
			
		}catch(Exception e){e.printStackTrace();}
		
	}

}
/*
 In this code example, the Employee instances returned by the query are immediately detached. 
 They are never associated with any persistence context.

The insert(), update() and delete() operations defined by the StatelessSession interface are considered to be
direct database row-level operations. They result in the immediate execution of a SQL INSERT, UPDATE or DELETE 
respectively. They have different semantics to the save(), saveOrUpdate() and delete() operations defined 
by the Session interface.

Lower-level abstraction, much closer to the underlying JDBC.
--> No associated persistence context.
--> Does not implement a first-level cache nor interact with any second-level or query cache. 
--> Does not implement transactional write-behind or automatic dirty checking. 
--> Operations do not ever cascade to associated instances. 
--> Collections are ignored by a stateless session.
--> Bypass Hibernate's event model and interceptors.
--> insert(), update() and delete() have different semantics than save(), saveOrUpdate() and delete() 

Methods of ScrollableResults
------------------------------

void	afterLast()  Go to a location just after the last result
void	beforeFirst() Go to a location just before first result (this is the initial location)
void	close()  Release resources immediately.
boolean	first() Go to the first result
Object[]	get()  Get the current row of results
Object	get(int i) Get the ith object in the current row of results, without initializing any other results in the row.
BigDecimal	getBigDecimal(int col)  Convenience method to read a big_decimal
BigInteger	getBigInteger(int col)  Convenience method to read a big_integer
byte[]	getBinary(int col) Convenience method to read a binary
Blob	getBlob(int col) Convenience method to read a blob
Boolean	getBoolean(int col) Convenience method to read a boolean
Byte	getByte(int col) Convenience method to read a byte
Calendar	getCalendar(int col) Convenience method to read a calendar or calendar_date
Character	getCharacter(int col) Convenience method to read a character
Clob	getClob(int col) Convenience method to read a clob
Date	getDate(int col) Convenience method to read a date, time or timestamp
Double	getDouble(int col) Convenience method to read a double
Float	getFloat(int col) Convenience method to read a float
Integer	getInteger(int col) Convenience method to read an integer
Locale	getLocale(int col) Convenience method to read a locale
Long	getLong(int col) Convenience method to read a long
int	getRowNumber() Get the current location in the result set.
Short	getShort(int col) Convenience method to read a short
String	getString(int col) Convenience method to read a string
String	getText(int col) Convenience method to read text
TimeZone	getTimeZone(int col) Convenience method to read a timezone
Type	getType(int i) Get the type of the ith column of results
boolean	isFirst() Is this the first result?
boolean	isLast() Is this the last result?
boolean	last() Go to the last result
boolean	next() Advance to the next result
boolean	previous() Retreat to the previous result
boolean	scroll(int i) Scroll an arbitrary number of locations
boolean	setRowNumber(int rowNumber) Set the current location in the result set, numbered from either the first row (row number 0), or the last row (row number -1).

*/
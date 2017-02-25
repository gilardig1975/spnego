package it.ibm.liberty.sample.idp.auth.servlets;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SnoopServlet
 */
@WebServlet("/snoop")
@ServletSecurity(@HttpConstraint(transportGuarantee = TransportGuarantee.CONFIDENTIAL, rolesAllowed =
{ "Snooper" }))
public class SnoopServlet extends AbstractRedirector
{

	private static final long serialVersionUID = 1L;

}

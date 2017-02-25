package it.ibm.liberty.sample.idp.auth.servlets;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SAMLServlet
 */
@WebServlet("/SAMLResponse")
@ServletSecurity(@HttpConstraint(transportGuarantee = TransportGuarantee.CONFIDENTIAL, rolesAllowed =
{ "IdentityRequestor" }))
public class SAMLResponseServlet extends AbstractRedirector
{

	private static final long serialVersionUID = 1L;


}

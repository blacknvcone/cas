package org.apereo.cas.mgmt.services.web.beans;


/**
 * Defines service types. CAS, OAuth, etc.
 * @author Misagh Moayyed
 * @since 4.1
 */
public enum RegisteredServiceTypeEditBean {

    /**
     * CAS type.
     */
    CAS("cas"),

    /**
     * CAS type.
     */
    OIDC("oidc"),
    
    /**
     * SAML type.
     */
    SAML("saml"),
    
    /**
     * CAS type.
     */
    OAUTH_CALLBACK_AUTHZ("oauth_callback_authz"),

    /**
     * oauth type.
     */
    OAUTH("oauth");

    private String value;

    /**
     * Instantiates a new AlgorithmTypes.
     *
     * @param value the value
     */
    RegisteredServiceTypeEditBean(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}

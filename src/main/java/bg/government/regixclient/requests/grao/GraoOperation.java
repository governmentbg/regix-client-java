package bg.government.regixclient.requests.grao;

import bg.government.regixclient.requests.Operation;

public enum GraoOperation implements Operation {
    PERMANENT_ADDRESS_SEARCH("TechnoLogica.RegiX.GraoPNAAdapter.APIService.IPNAAPI.PermanentAddressSearch"),
    PERSON_DATA_SEARCH("echnoLogica.RegiX.GraoNBDAdapter.APIService.INBDAPI.PersonDataSearch ");
    
    private final String key;
    
    private GraoOperation(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}

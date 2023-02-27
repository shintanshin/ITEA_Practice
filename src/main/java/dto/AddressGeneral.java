package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = AddressGeneral.class)
public class AddressGeneral {
    @JsonProperty("Ref")
    private String Ref;
    @JsonProperty("SettlementType")
    private String SttlementType;
    @JsonProperty("Latitude")
    private String Latitude;
    @JsonProperty("Longitude")
    private String Longitude;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DescriptionRu")
    private String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    private String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    private String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    private String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    private String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("RegionsDescription")
    private String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    private String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    private String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    private String Area;
    @JsonProperty("AreaDescription")
    private String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    private String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    private String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    private String Index1;
    @JsonProperty("Index2")
    private String Index2;
    @JsonProperty("IndexCOATSU1")
    private String IndexCOATSU1;
    @JsonProperty("Delivery1")
    private String Delivery1;
    @JsonProperty("Delivery2")
    private String Delivery2;
    @JsonProperty("Delivery3")
    private String Delivery3;
    @JsonProperty("Delivery4")
    private String Delivery4;
    @JsonProperty("Delivery5")
    private String Delivery5;
    @JsonProperty("Delivery6")
    private String Delivery6;
    @JsonProperty("Delivery7")
    private String Delivery7;
    @JsonProperty("SpecialCashCheck")
    private int SpecialCashCheck;
    @JsonProperty("Warehouse")
    private String Warehouse;

    @JsonCreator
    public AddressGeneral(@JsonProperty("Ref") String Ref,
                          @JsonProperty("SettlementType") String SettlementType,
                          @JsonProperty("Latitude") String Latitude,
                          @JsonProperty("Longitude") String Longitude,
                          @JsonProperty("Description") String Description,
                          @JsonProperty("DescriptionRu") String DescriptionRu,
                          @JsonProperty("DescriptionTranslit") String DescriptionTranslit,
                          @JsonProperty("SettlementTypeDescription") String SettlementTypeDescription,
                          @JsonProperty("SettlementTypeDescriptionRu") String SettlementTypeDescriptionRu,
                          @JsonProperty("SettlementTypeDescriptionTranslit") String SettlementTypeDescriptionTranslit,
                          @JsonProperty("Region") String Region,
                          @JsonProperty("RegionsDescription") String RegionsDescription,
                          @JsonProperty("RegionsDescriptionRu") String RegionsDescriptionRu,
                          @JsonProperty("RegionsDescriptionTranslit") String RegionsDescriptionTranslit,
                          @JsonProperty("Area") String Area,
                          @JsonProperty("AreaDescription") String areaDescription,
                          @JsonProperty("AreaDescriptionRu") String AreaDescriptionRu,
                          @JsonProperty("AreaDescriptionTranslit") String AreaDescriptionTranslit,
                          @JsonProperty("Index1") String Index1,
                          @JsonProperty("Index2") String Index2,
                          @JsonProperty("IndexCOATSU1") String IndexCOATSU1,
                          @JsonProperty("SpecialCashCheck") int SpecialCashCheck,
                          @JsonProperty("Warehouse") String Warehouse) {
        this.Ref = Ref;
        this.SttlementType = SettlementType;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Description = Description;
        this.DescriptionRu = DescriptionRu;
        this.DescriptionTranslit = DescriptionTranslit;
        this.SettlementTypeDescription = SettlementTypeDescription;
        this.SettlementTypeDescriptionRu = SettlementTypeDescriptionRu;
        this.SettlementTypeDescriptionTranslit = SettlementTypeDescriptionTranslit;
        this.Region = Region;
        this.RegionsDescription = RegionsDescription;
        this.RegionsDescriptionRu = RegionsDescriptionRu;
        this.RegionsDescriptionTranslit = RegionsDescriptionTranslit;
        this.Area = Area;
        this.AreaDescription = areaDescription;
        this.AreaDescriptionRu = AreaDescriptionRu;
        this.AreaDescriptionTranslit = AreaDescriptionTranslit;
        this.Index1 = Index1;
        this.Index2 = Index2;
        this.IndexCOATSU1 = IndexCOATSU1;
        this.SpecialCashCheck = SpecialCashCheck;
        this.Warehouse = Warehouse;
    }

    @Getter
    public String getRef() {
        return Ref;
    }

    @Setter
    public void setRef(String ref) {
        Ref = ref;
    }

    @Getter
    public String getSttlementType() {
        return SttlementType;
    }

    @Setter
    public void setSttlementType(String sttlementType) {
        SttlementType = sttlementType;
    }

    @Getter
    public String getLatitude() {
        return Latitude;
    }

    @Setter
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    @Getter
    public String getLongitude() {
        return Longitude;
    }

    @Setter
    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Getter
    public String getDescription() {
        return Description;
    }

    @Setter
    public void setDescription(String description) {
        Description = description;
    }

    @Getter
    public String getDescriptionRu() {
        return DescriptionRu;
    }

    @Setter
    public void setDescriptionRu(String descriptionRu) {
        DescriptionRu = descriptionRu;
    }

    @Getter
    public String getDescriptionTranslit() {
        return DescriptionTranslit;
    }

    @Setter
    public void setDescriptionTranslit(String descriptionTranslit) {
        DescriptionTranslit = descriptionTranslit;
    }

    @Getter
    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }

    @Setter
    public void setSettlementTypeDescription(String settlementTypeDescription) {
        SettlementTypeDescription = settlementTypeDescription;
    }

    @Getter
    public String getSettlementTypeDescriptionRu() {
        return SettlementTypeDescriptionRu;
    }

    @Setter
    public void setSettlementTypeDescriptionRu(String settlementTypeDescriptionRu) {
        SettlementTypeDescriptionRu = settlementTypeDescriptionRu;
    }

    @Getter
    public String getSettlementTypeDescriptionTranslit() {
        return SettlementTypeDescriptionTranslit;
    }

    @Setter
    public void setSettlementTypeDescriptionTranslit(String settlementTypeDescriptionTranslit) {
        SettlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
    }

    @Getter
    public String getRegion() {
        return Region;
    }

    @Setter
    public void setRegion(String region) {
        Region = region;
    }

    @Getter
    public String getRegionsDescription() {
        return RegionsDescription;
    }

    @Setter
    public void setRegionsDescription(String regionsDescription) {
        RegionsDescription = regionsDescription;
    }

    @Getter
    public String getRegionsDescriptionRu() {
        return RegionsDescriptionRu;
    }

    @Setter
    public void setRegionsDescriptionRu(String regionsDescriptionRu) {
        RegionsDescriptionRu = regionsDescriptionRu;
    }

    @Getter
    public String getRegionsDescriptionTranslit() {
        return RegionsDescriptionTranslit;
    }

    @Setter
    public void setRegionsDescriptionTranslit(String regionsDescriptionTranslit) {
        RegionsDescriptionTranslit = regionsDescriptionTranslit;
    }

    @Getter
    public String getArea() {
        return Area;
    }

    @Setter
    public void setArea(String area) {
        Area = area;
    }

    @Getter
    public String getAreaDescription() {
        return AreaDescription;
    }

    @Setter
    public void setAreaDescription(String areaDescription) {
        AreaDescription = areaDescription;
    }

    @Getter
    public String getAreaDescriptionRu() {
        return AreaDescriptionRu;
    }

    @Setter
    public void setAreaDescriptionRu(String areaDescriptionRu) {
        AreaDescriptionRu = areaDescriptionRu;
    }

    @Getter
    public String getAreaDescriptionTranslit() {
        return AreaDescriptionTranslit;
    }

    @Setter
    public void setAreaDescriptionTranslit(String areaDescriptionTranslit) {
        AreaDescriptionTranslit = areaDescriptionTranslit;
    }

    @Getter
    public String getIndex1() {
        return Index1;
    }

    @Setter
    public void setIndex1(String index1) {
        Index1 = index1;
    }

    @Getter
    public String getIndex2() {
        return Index2;
    }

    @Setter
    public void setIndex2(String index2) {
        Index2 = index2;
    }

    @Getter
    public String getIndexCOATSU1() {
        return IndexCOATSU1;
    }

    @Setter
    public void setIndexCOATSU1(String indexCOATSU1) {
        IndexCOATSU1 = indexCOATSU1;
    }

    @Getter
    public int getSpecialCashCheck() {
        return SpecialCashCheck;
    }

    @Setter
    public void setSpecialCashCheck(int specialCashCheck) {
        SpecialCashCheck = specialCashCheck;
    }

    @Getter
    public String getWarehouse() {
        return Warehouse;
    }

    @Setter
    public void setWarehouse(String warehouse) {
        Warehouse = warehouse;
    }

    public String toString() {
        return "AddressGeneral{" +
                "Description='" + Description + '\'' +
                ", DescriptionRu='" + DescriptionRu + '\'' +
                ", DescriptionTranslit='" + DescriptionTranslit + '\'' +
                ", SettlementTypeDescription='" + SettlementTypeDescription + '\'' +
                ", SettlementTypeDescriptionRu='" + SettlementTypeDescriptionRu + '\'' +
                ", SettlementTypeDescriptionTranslit='" + SettlementTypeDescriptionTranslit + '\'' +
                ", Region='" + Region + '\'' +
                ", RegionsDescription='" + RegionsDescription + '\'' +
                ", RegionsDescriptionRu='" + RegionsDescriptionRu + '\'' +
                ", RegionsDescriptionTranslit='" + RegionsDescriptionTranslit + '\'' +
                ", Area='" + Area + '\'' +
                ", AreaDescription='" + AreaDescription + '\'' +
                ", AreaDescriptionRu='" + AreaDescriptionRu + '\'' +
                ", AreaDescriptionTranslit='" + AreaDescriptionTranslit + '\'' +
                ", Index1='" + Index1 + '\'' +
                ", Index2='" + Index2 + '\'' +
                ", IndexCOATSU1='" + IndexCOATSU1 + '\'' +
                ", SpecialCashCheck='" + SpecialCashCheck + '\'' +
                ", Warehouse='" + Warehouse + '\'' +
                '}';
    }
}

package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@NoArgsConstructor
@Data
public class EuVatCustomsDeclaration {
    @JsonProperty("product")
    private Product product;
    @JsonProperty("merchant_identity")
    private String merchantIdentity;
    @JsonProperty("vat_paid_in_authority_currency")
    private Amount vatPaidInAuthorityCurrency;
    @JsonProperty("vat_paid_in_customer_currency")
    private Amount vatPaidInCustomerCurrency;
    @JsonProperty("shipping_cost_in_customer_currency")
    private ShippingCostInCustomerCurrency shippingCostInCustomerCurrency;
    @JsonProperty("customer_identity")
    private String customerIdentity;
    @JsonProperty("vat_payer")
    private VatPayer vatPayer;
    @JsonProperty("merchant_address")
    private ShippingDetail merchantAddress;
    @JsonProperty("invoice_amount_in_customer_currency")
    private InvoiceAmountInCustomerCurrency invoiceAmountInCustomerCurrency;
    @JsonProperty("shipping_cost_in_authority_currency")
    private ShippingCostInAuthorityCurrency shippingCostInAuthorityCurrency;
    @JsonProperty("invoice_amount_in_authority_currency")
    private InvoiceAmountInAuthorityCurrency invoiceAmountInAuthorityCurrency;
    @JsonProperty("customer_address")
    private ShippingDetail customerAddress;
    @JsonProperty("merchant_name")
    private String merchantName;
    @JsonProperty("platform_status")
    private String platformStatus;
    @JsonProperty("customer_name")
    private String customerName;
}

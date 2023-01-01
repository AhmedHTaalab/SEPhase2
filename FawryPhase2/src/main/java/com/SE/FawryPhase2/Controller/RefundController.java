package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.RefundBsl;
import com.SE.FawryPhase2.Model.Refund.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/refund")
public class RefundController {
    private RefundBsl model;

    public RefundController(RefundBsl model) {
        this.model = model;
    }

    @PutMapping("/requestRefund")
    public void requestRefund(@RequestBody RefundBsl refund) {
        model.requestRefund(refund);
    }

    @PutMapping("/confirmation")
    public void refundConfirmation(@RequestBody boolean isConfirmed) {
        model.refundConfirmation(isConfirmed);
    }

    @GetMapping("/amount")
    public int getAmount() {
        return model.getRefund().getAmount();
    }

    @GetMapping("/user")
    public User getUser() {
        return model.getRefund().getUser();
    }
}
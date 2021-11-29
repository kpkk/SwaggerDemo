import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
       urlPath("/fraud")
        method(GET())
    }
    response {
        status(200)
        body(["Alex","verified"])
    }

}

package io.github.littlenag.scalajs.components.`react-bootstrap`

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Table component
  */
object Table extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Any = ReactBootstrapModule.Table
  def apply(bordered: js.UndefOr[Boolean] = js.undefined,
            hover: js.UndefOr[Boolean] = js.undefined,
            responsive: js.UndefOr[Boolean | String] = js.undefined,
            size: js.UndefOr[String] = js.undefined,
            striped: js.UndefOr[Boolean] = js.undefined,
            variant: js.UndefOr[String] = js.undefined,
            bsPrefix: js.UndefOr[String] = js.undefined): WithProps = auto
}

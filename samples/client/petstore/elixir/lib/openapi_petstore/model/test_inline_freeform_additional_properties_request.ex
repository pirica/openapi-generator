# NOTE: This file is auto generated by OpenAPI Generator 7.15.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.TestInlineFreeformAdditionalPropertiesRequest do
  @moduledoc """
  
  """

  @derive JSON.Encoder
  defstruct [
    :someProperty
  ]

  @type t :: %__MODULE__{
    :someProperty => String.t | nil
  }

  def decode(value) do
    value
  end
end


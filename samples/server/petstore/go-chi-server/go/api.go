// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 */

package petstoreserver

import (
	"context"
	"net/http"
	"time"
	"os"
)



// FakeAPIRouter defines the required methods for binding the api requests to a responses for the FakeAPI
// The FakeAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FakeAPIServicer to perform the required actions, then write the service results to the http response.
type FakeAPIRouter interface { 
	FakePostTest(http.ResponseWriter, *http.Request)
}
// PetAPIRouter defines the required methods for binding the api requests to a responses for the PetAPI
// The PetAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PetAPIServicer to perform the required actions, then write the service results to the http response.
type PetAPIRouter interface { 
	UpdatePet(http.ResponseWriter, *http.Request)
	AddPet(http.ResponseWriter, *http.Request)
	FindPetsByStatus(http.ResponseWriter, *http.Request)
	SearchPet(http.ResponseWriter, *http.Request)
	// Deprecated
	FindPetsByTags(http.ResponseWriter, *http.Request)
	FilterPetsByCategory(http.ResponseWriter, *http.Request)
	GetPetById(http.ResponseWriter, *http.Request)
	UpdatePetWithForm(http.ResponseWriter, *http.Request)
	DeletePet(http.ResponseWriter, *http.Request)
	GetPetImageById(http.ResponseWriter, *http.Request)
	UploadFile(http.ResponseWriter, *http.Request)
	UploadFileArrayOfFiles(http.ResponseWriter, *http.Request)
	GetPetsUsingBooleanQueryParameters(http.ResponseWriter, *http.Request)
	GetPetsByTime(http.ResponseWriter, *http.Request)
}
// StoreAPIRouter defines the required methods for binding the api requests to a responses for the StoreAPI
// The StoreAPIRouter implementation should parse necessary information from the http request,
// pass the data to a StoreAPIServicer to perform the required actions, then write the service results to the http response.
type StoreAPIRouter interface { 
	GetInventory(http.ResponseWriter, *http.Request)
	PlaceOrder(http.ResponseWriter, *http.Request)
	GetOrderById(http.ResponseWriter, *http.Request)
	DeleteOrder(http.ResponseWriter, *http.Request)
}
// UserAPIRouter defines the required methods for binding the api requests to a responses for the UserAPI
// The UserAPIRouter implementation should parse necessary information from the http request,
// pass the data to a UserAPIServicer to perform the required actions, then write the service results to the http response.
type UserAPIRouter interface { 
	CreateUser(http.ResponseWriter, *http.Request)
	CreateUsersWithArrayInput(http.ResponseWriter, *http.Request)
	CreateUsersWithListInput(http.ResponseWriter, *http.Request)
	LoginUser(http.ResponseWriter, *http.Request)
	LogoutUser(http.ResponseWriter, *http.Request)
	GetUserByName(http.ResponseWriter, *http.Request)
	UpdateUser(http.ResponseWriter, *http.Request)
	DeleteUser(http.ResponseWriter, *http.Request)
}


// FakeAPIServicer defines the api actions for the FakeAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FakeAPIServicer interface { 
	FakePostTest(context.Context, string) (ImplResponse, error)
}


// PetAPIServicer defines the api actions for the PetAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PetAPIServicer interface { 
	UpdatePet(context.Context, Pet) (ImplResponse, error)
	AddPet(context.Context, Pet) (ImplResponse, error)
	FindPetsByStatus(context.Context, []string, string, string, int32, float32, string) (ImplResponse, error)
	SearchPet(context.Context, *int64, *float32, *time.Time, *bool) (ImplResponse, error)
	// Deprecated
	FindPetsByTags(context.Context, []string, time.Time, time.Time, Colour) (ImplResponse, error)
	FilterPetsByCategory(context.Context, Gender, Species, []Species) (ImplResponse, error)
	GetPetById(context.Context, int64) (ImplResponse, error)
	UpdatePetWithForm(context.Context, int64, string, string) (ImplResponse, error)
	DeletePet(context.Context, int64, string) (ImplResponse, error)
	GetPetImageById(context.Context, int64) (ImplResponse, error)
	UploadFile(context.Context, int64, string, []string, *os.File) (ImplResponse, error)
	UploadFileArrayOfFiles(context.Context, int64, string, []*os.File) (ImplResponse, error)
	GetPetsUsingBooleanQueryParameters(context.Context, bool, bool, bool) (ImplResponse, error)
	GetPetsByTime(context.Context, time.Time) (ImplResponse, error)
}


// StoreAPIServicer defines the api actions for the StoreAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type StoreAPIServicer interface { 
	GetInventory(context.Context) (ImplResponse, error)
	PlaceOrder(context.Context, Order) (ImplResponse, error)
	GetOrderById(context.Context, int64) (ImplResponse, error)
	DeleteOrder(context.Context, string) (ImplResponse, error)
}


// UserAPIServicer defines the api actions for the UserAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type UserAPIServicer interface { 
	CreateUser(context.Context, User) (ImplResponse, error)
	CreateUsersWithArrayInput(context.Context, []User) (ImplResponse, error)
	CreateUsersWithListInput(context.Context, []User) (ImplResponse, error)
	LoginUser(context.Context, string, string, bool) (ImplResponse, error)
	LogoutUser(context.Context) (ImplResponse, error)
	GetUserByName(context.Context, string) (ImplResponse, error)
	UpdateUser(context.Context, string, User) (ImplResponse, error)
	DeleteUser(context.Context, string, bool) (ImplResponse, error)
}
